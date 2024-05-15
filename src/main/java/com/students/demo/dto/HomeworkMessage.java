package com.students.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public record HomeworkMessage(Integer count, String text, Long delay) {}
