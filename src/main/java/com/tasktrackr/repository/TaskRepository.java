package com.tasktrackr.repository;

import com.tasktrackr.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUserId(Long userId);

    List<Task> findByCategoryId(Long categoryId);

    List<Task> findByIsComplete(boolean isComplete);
}
