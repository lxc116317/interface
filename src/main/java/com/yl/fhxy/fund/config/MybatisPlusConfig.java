package com.yl.fhxy.fund.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description mybatisPlus分页插件配置
 * @CreateDate 2020/09/02
 * @Author lzb
 * @Version 1.0.0
 */
@Configuration
public class MybatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }


    @Bean
    public PerformanceInterceptor performanceInterceptor(){
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
//        控制台代码格式化
        performanceInterceptor.setFormat(true);
        return performanceInterceptor;
    }
}
