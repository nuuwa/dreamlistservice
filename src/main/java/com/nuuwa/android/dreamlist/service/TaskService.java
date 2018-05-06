package com.nuuwa.android.dreamlist.service;


import com.nuuwa.android.dreamlist.entity.Task;
import com.nuuwa.android.dreamlist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public Task findTask(String title) {
        return taskRepository.findByTitle(title);
    }

    public Task save(Task task) {
        return taskRepository.save(task);
    }
}
