package com.feelingSpring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.feelingSpring.dao") // 添加 @Mapper 注解
public class FeelingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeelingSpringApplication.class, args);
	}

}
