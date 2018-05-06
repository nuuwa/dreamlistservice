package com.nuuwa.android.dreamlist;

import com.nuuwa.android.dreamlist.entity.Task;
import com.nuuwa.android.dreamlist.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(TaskRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new Task(1L, "Justin"));

            repository.findById(1L)
                    .ifPresent(task -> {
                        log.info("Task found with findByTitle(1L):");
                        log.info("--------------------------------");
                        log.info(task.toString());
                        log.info("");
                    });
        };
    }
}

