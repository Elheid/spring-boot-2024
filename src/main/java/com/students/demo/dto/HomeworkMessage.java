package com.students.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public record HomeworkMessage(Integer count, String text, Long delay) {}
//public record HomeworkMessage(Integer counter, String message) implements  Serializable {}
/*@Getter
@Setter
@AllArgsConstructor
public class HomeworkMessage implements Serializable {
    private int count;
    private String text;
    private int delay;

}*/