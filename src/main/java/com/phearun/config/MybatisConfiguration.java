package com.phearun.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.phearun.repository")
public class MybatisConfiguration {

}
