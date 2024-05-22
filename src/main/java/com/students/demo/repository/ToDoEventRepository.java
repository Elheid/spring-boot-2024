package com.students.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ToDoEventRepository extends JpaRepository<ToDoEvent, Integer> {
}
