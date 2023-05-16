package com.writter;

import com.writter.task.WritterTaskExecutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@EnableTask
public class TaskWritterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskWritterApplication.class, args);
    }

    @Bean
    public TaskExecutor writterExecutor(JdbcTemplate template){
        return new WritterTaskExecutor(template);
    }

}
