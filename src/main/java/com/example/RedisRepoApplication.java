package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableRedisRepositories
public class RedisRepoApplication {

    public static void main(String[] args) {

        SpringApplication.run(RedisRepoApplication.class, args);

    }
}
