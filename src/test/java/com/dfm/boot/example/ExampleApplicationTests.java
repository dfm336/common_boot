package com.dfm.boot.example;

import com.dfm.boot.example.domain.Repository;
import com.dfm.boot.example.mappers.RepositoryMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ExampleApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private RepositoryMapper repositoryMapper;

    @Test
    public void test(){
        List<Repository> repositories = repositoryMapper.selectAll();
        repositories.forEach(System.out::println);
    }

}
