package com.dfm.boot.example.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author:fengming.dai
 */
@Configuration
@MapperScan(
        basePackages = {"com.dfm.boot.example.mappers", "cn.zswltech.gungnir.core.**.mappers", "cn.zswltech.gruul.dao.dal.dao"},
        sqlSessionTemplateRef = "sqlSessionTemplate")
public class MybatisConfig {


    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;

    private static final String mybatisConfig = "mybatis/mybatis-config.xml";

    /**
     * mapper扫描路径
     */
    private static final String mapperPath[] = {"classpath*:mybatis/mapper/*Mapper.xml", "classpath*:flow/mapper/*Mapper.xml", "classpath*:mapper/*Mapper.xml"};


    /**
     * typeAlias包扫描路径
     */
    private static final String typeAliasPackage = "com.dfm.boot.example";


    @Primary
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(dataSource);
        factory.setTypeAliasesPackage(typeAliasPackage);
        factory.setConfigLocation(new ClassPathResource(mybatisConfig));

        //添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        List<Resource> res = new ArrayList<>();
        for(String path : mapperPath){
            Resource[] resources = resolver.getResources(path);
            res.addAll(Arrays.asList(resources));
        }
        factory.setMapperLocations(res.toArray(new Resource[res.size()]));
        return factory;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() {
        try {
            return sqlSessionFactoryBean().getObject();
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }
    }


    @Bean
    @Primary
    public SqlSessionTemplate sqlSessionTemplate(){
        return new SqlSessionTemplate(sqlSessionFactory());
    }


    @Bean
    @Primary
    public PlatformTransactionManager txManager() {
        return new DataSourceTransactionManager(dataSource);
    }

}
