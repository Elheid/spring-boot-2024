package com.students.demo.Controllers;

import com.students.demo.ToDoListService;
import com.students.demo.dto.ToDoListDTO;
import com.students.demo.dto.response.ToDoListRequest;
import com.students.demo.dto.response.TodoListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/BD")
public class TodoListController {

    @Autowired
    private ToDoListService toDoListService;

    @PostMapping
    public List<ToDoListRequest> createToDoList(@RequestBody ToDoListDTO toDoListDTO) {
        return toDoListService.createToDoRequest(toDoListDTO);
    }

    @GetMapping
    public List<TodoListResponse> getAllTodoLists() {
        return toDoListService.createToDoResponse();
    }
}