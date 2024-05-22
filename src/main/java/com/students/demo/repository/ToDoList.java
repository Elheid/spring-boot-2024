package com.students.demo.repository;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
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


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "todo_list_id")
    private List<ToDoEvent> events;

    public String[] getEventNames() {
        return events.stream()
                .map(ToDoEvent::getName)
                .toArray(String[]::new);
    }

}
