package com.students.demo.dto.response;

import java.util.List;

public record ToDoListRequest(String name, List<String> events) {}