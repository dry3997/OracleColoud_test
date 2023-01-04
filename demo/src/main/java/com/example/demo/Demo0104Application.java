package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//매퍼연결 추가
@MapperScan(basePackages = "com.example.demo.**.mapper") 
public class Demo0104Application {

	//진입파일이기 때문에 손대지 않을것.. 시작불가능 할 수 있음.
	public static void main(String[] args) {
		SpringApplication.run(Demo0104Application.class, args);
	}

}
