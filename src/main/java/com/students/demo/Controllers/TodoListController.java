package com.students.demo.Controllers;

import com.students.demo.dto.response.TodoListResponse;
import com.students.demo.repository.ToDoList;
import com.students.demo.repository.ToDoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/BD")
public class TodoListController {
    @Autowired
    private ToDoListRepository todoListRepository;


    @PostMapping
    public ToDoList createTodoList(@RequestBody ToDoList todoList) {
        return todoListRepository.save(todoList);
    }

    @GetMapping
    public List<TodoListResponse> getAllTodoLists() {
        List<TodoListResponse> response = new ArrayList<>();
        List<ToDoList> todoLists = todoListRepository.findAll();
        for (ToDoList todoList : todoLists) {
            response.add(new TodoListResponse(todoList.getName(), List.of(todoList.getEvents())));
        }
        return response;
    }
}