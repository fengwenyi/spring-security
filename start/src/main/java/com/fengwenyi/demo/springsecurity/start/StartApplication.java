package com.fengwenyi.demo.springsecurity.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration // 自动配置
public class StartApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
	    return "hello spring boot";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello World";
    }
}
