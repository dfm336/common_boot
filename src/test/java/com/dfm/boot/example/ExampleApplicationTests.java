package com.dfm.boot.example;

import com.dfm.boot.example.domain.Repository;
import com.dfm.boot.example.mappers.RepositoryMapper;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ThreadMXBean;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Slf4j
@SpringBootTest
class ExampleApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private RepositoryMapper repositoryMapper;


    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 5, TimeUnit.SECONDS, new ArrayBlockingQueue<>(50));
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        String jvmName = runtimeMXBean.getName();
        System.out.println("jvmName = " + jvmName);

        String pidName = jvmName.split("@")[0];
        long pid = Long.parseLong(pidName);

        System.out.println("pid = " + pid);


        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        for (int i = 0; i < 20; i++) {
            threadPoolExecutor.execute(()->{
                System.out.println("当前线程总数为："+threadMXBean.getThreadCount());
            });
        }
        threadPoolExecutor.shutdown();

        Thread.sleep(1000);
        System.out.println("线程总数为："+threadMXBean.getThreadCount());

    }

    /**
     *  3k  数据。 idx_title key(title) 普通索引
     *  左右模糊  %制度% 778ms
     *  右模糊  制度% 724ms
     *
     *  3w 数据  idx_title key(title) 普通索引
     *   左右模糊  %制度%     971ms
     *   右模糊    制度%     850ms
     *
     *   3w 数据  fulltext_title FULLTEXT KEY(title) 全文索引
     *      左右模糊  制度     723ms  (数据不准确）
     *
     *     - mysql 8.0   cost 536
     *     - mysql 5.7  cost 677
     *
     *  instr 实现
     *  3w   全文索引 左右模糊， 907
     *      idx_title   1009
     *      idx_title limit 5   cost 751
     *     full_text  limit 5    758
     *
     *
     */
    @Test
    public void searchTitle(){
        String title = "物料";
        long start = System.currentTimeMillis();
        List<Repository> list = repositoryMapper.searchTitleFullTextIndex(title);
        long end = System.currentTimeMillis();
        log.info("cost :{}",end-start);

        System.out.println("*************DATA********************");
        list.stream().forEach(System.out::println);
    }

    @Test
    public void test(){

        Example example = new Example(Repository.class);
        example.createCriteria()
                .andGreaterThan(Repository.ID,5128278);
        repositoryMapper.deleteByExample(example);

        List<Repository> repositories = repositoryMapper.selectAll();

        for (Repository repository : repositories) {
            List<Repository> adds = Lists.newArrayList();
            for (int i=0; i< 2000; i++){
                Repository cp = new Repository();
                BeanUtils.copyProperties(repository,cp);
                cp.setTitle(cp.getTitle()+":"+i);
                cp.setId(null);
                adds.add(cp);
            }
            long start = System.currentTimeMillis();
            repositoryMapper.insertList(adds);
            long end = System.currentTimeMillis();
            log.info("cost :{}",end-start);
        }
    }

}
