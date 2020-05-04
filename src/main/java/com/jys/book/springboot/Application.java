package com.jys.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


//스프링 부트의 자동설정, Bean 읽기와 생성을 자동으로 실행
@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        //내장 WAS 실행
       SpringApplication.run(Application.class, args);
    }
}
