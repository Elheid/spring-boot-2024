package com.students.demo.dto;



import java.util.List;


public record ToDoListDTO(String name, List<ToDoEventDTO> events) {}