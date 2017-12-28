package com.yummy.bosvcservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication

@ServletComponentScan("com.yummy")
public class BosvcserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BosvcserviceApplication.class, args);
	}
}
