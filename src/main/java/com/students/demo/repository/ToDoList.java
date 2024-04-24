package com.students.demo.repository;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.lang.reflect.Array;
import java.util.List;

@FieldDefaults(level= AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
@Table(name = "todolist")
public class ToDoList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;

   /* @OneToMany(mappedBy = "todolist", cascade = CascadeType.ALL)
    private List<ToDoEvent> events;*/

    @Column(columnDefinition = "VARCHAR(255)[]")
    String[] events;
}
