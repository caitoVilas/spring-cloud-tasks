package com.reader;

import com.reader.task.ReadTaskExcecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@EnableTask
@Slf4j
public class TaskReaderApplication implements CommandLineRunner {
    @Autowired
    JdbcTemplate template;

    public static void main(String[] args) {
        SpringApplication.run(TaskReaderApplication.class, args);
    }

    @Bean
    public TaskExecutor readerExecutor(JdbcTemplate template){
        return new ReadTaskExcecutor(template);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
