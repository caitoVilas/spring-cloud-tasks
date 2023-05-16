package com.reader.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.task.listener.TaskExecutionListener;
import org.springframework.cloud.task.repository.TaskExecution;
import org.springframework.core.task.TaskExecutor;
import org.springframework.jdbc.core.JdbcTemplate;

@Slf4j
public class ReadTaskExcecutor implements TaskExecutor, TaskExecutionListener {
    private final JdbcTemplate jdbcTemplate;

    public ReadTaskExcecutor(JdbcTemplate jdbcTemplate) {
        log.info("constructor tarea read task ejecutor");
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void execute(Runnable task) {
        log.info("metodo para lectura de datos de la DB...");
    }

    @Override
    public void onTaskStartup(TaskExecution taskExecution) {
        log.info("comienzo metodo para lectura de datos de la DB...");
    }

    @Override
    public void onTaskEnd(TaskExecution taskExecution) {
        log.info("finaliza metodo para lectura de datos de la DB...");

    }

    @Override
    public void onTaskFailed(TaskExecution taskExecution, Throwable throwable) {
        log.info("Error metodo para lectura de datos de la DB...");

    }
}
