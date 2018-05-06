package com.nuuwa.android.dreamlist.repository;

import com.nuuwa.android.dreamlist.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findByTitle(String title);

    Task save(Task task);
}
