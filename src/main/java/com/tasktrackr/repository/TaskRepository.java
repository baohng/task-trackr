package com.tasktrackr.repository;

import com.tasktrackr.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUserId(Long userId);

    List<Task> findByCategoryId(Long categoryId);

    List<Task> findByCategoryName(String categoryName);

    List<Task> findByIsComplete(boolean isComplete);
}
