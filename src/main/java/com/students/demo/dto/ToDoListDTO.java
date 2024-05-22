package com.students.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


public record ToDoListDTO(String name, List<ToDoEventDTO> events) {}