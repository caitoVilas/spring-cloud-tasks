package com.writter.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.task.TaskExecutor;
import org.springframework.jdbc.core.JdbcTemplate;

@Slf4j
public class WritterTaskExecutor implements TaskExecutor {
    private final JdbcTemplate template;

    public WritterTaskExecutor(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void execute(Runnable task) {
        log.info("metodo para escritura de datos de la DB...");
    }
}
