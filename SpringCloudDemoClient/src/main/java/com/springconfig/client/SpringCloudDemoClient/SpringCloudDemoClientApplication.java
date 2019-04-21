package com.springconfig.client.SpringCloudDemoClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RefreshScope
@RestController
public class SpringCloudDemoClientApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoClientApplication.class, args);
	}
	
	@Value("${hello.message}")
    private String message;
    @RequestMapping("/message")
    String getMessage() {
    	System.out.println("SpringCloudDemoClientApplication.getMessage()");
        return this.message;
    }
   
	
}
