package org.spring.cloud.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class Application 
{
	private final static Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main( String[] args )
    {
    	SpringApplication.run(Application.class, args);
//    	new SpringApplicationBuilder(Application.class).web(true).run(args);
        logger.info("Spring Cloud Eureka Start");
    }
}
