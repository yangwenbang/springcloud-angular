package org.spring.boot.web.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configurable
@EnableDiscoveryClient
@EnableEurekaClient
//启动事物管理
@EnableTransactionManagement
@ComponentScan("org.spring.boot.web")
@MapperScan("org.spring.boot.web.dao")
@EnableAspectJAutoProxy
public class WebConfig {
	
}
