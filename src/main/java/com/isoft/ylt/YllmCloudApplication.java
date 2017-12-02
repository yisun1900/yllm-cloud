package com.isoft.ylt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class YllmCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(YllmCloudApplication.class, args);
	}
}
