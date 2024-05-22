package com.students.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoEventRepository extends JpaRepository<ToDoEvent, Integer> {
}
