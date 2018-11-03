package org.spring.boot.web;

import org.spring.boot.api.utils.MD5Util;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot!
 *
 */
@RestController
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
    @RequestMapping("/helloboot")
	String index(){
    	String encode = MD5Util.MD5("ywb");
    	
    	return encode;
//    	return "hello word";
	}
   
}
