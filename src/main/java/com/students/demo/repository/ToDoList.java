package com.students.demo.repository;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level= AccessLevel.PRIVATE)
@Getter
@Setter
@Entity

public class ToDoList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;


    /*@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "event_list",
            joinColumns = @JoinColumn(name = "todo_list_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id")
    )
    private List<ToDoEvent> events = new ArrayList<>();*/

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "todo_list_id")  // Обновлено: используем JoinColumn вместо JoinTable
    private List<ToDoEvent> events;

    public String[] getEventNames() {
        return events.stream()
                .map(ToDoEvent::getName) // Преобразование ToDoEvent в его имя
                .toArray(String[]::new); // Преобразование в массив строк
    }

}
