package com.yummy.center;

import com.yummy.bo.boservice.BoserviceApplication;
import com.yummy.bosvcservice.BosvcserviceApplication;
import com.yummy.object.object.ObjectApplication;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ServletComponentScan("com.yummy")
public class CenterApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
				.bannerMode(Banner.Mode.CONSOLE)
				.sources(ObjectApplication.class, BoserviceApplication.class,BosvcserviceApplication.class,CenterApplication.class)
				.run(args);
		//SpringApplication.run(CenterApplication.class, args);
	}
}
