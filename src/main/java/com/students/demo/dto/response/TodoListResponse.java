package com.students.demo.dto.response;


import java.util.List;

public record TodoListResponse(String name, List<String> events) {}