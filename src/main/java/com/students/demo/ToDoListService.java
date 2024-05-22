package com.students.demo;

import com.students.demo.dto.ToDoEventDTO;
import com.students.demo.dto.ToDoListDTO;
import com.students.demo.dto.response.ToDoListRequest;
import com.students.demo.dto.response.TodoListResponse;
import com.students.demo.repository.ToDoEvent;
import com.students.demo.repository.ToDoList;
import com.students.demo.repository.ToDoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoListService {


    @Autowired
    private ToDoListRepository toDoListRepository;

    public void createToDoList(ToDoListDTO toDoListDTO) {
        ToDoList toDoList = new ToDoList();
        toDoList.setName(toDoListDTO.name());

        List<ToDoEvent> events = toDoListDTO.events().stream()
                .map(eventDTO -> {
                    ToDoEvent event = new ToDoEvent();
                    event.setName(eventDTO.name());
                    return event;
                })
                .collect(Collectors.toList());

        toDoList.setEvents(events);

        toDoListRepository.save(toDoList);
    }

    public List<TodoListResponse> createToDoResponse() {
        List<TodoListResponse> response = new ArrayList<>();
        var todoLists = toDoListRepository.findAll();
        for (ToDoList todoList : todoLists) {
            response.add(new TodoListResponse(todoList.getName(), List.of(todoList.getEventNames())));
        }
        return response;
    }

    public List<ToDoListRequest> createToDoRequest(ToDoListDTO toDoListDTO) {
        createToDoList(toDoListDTO);
        List<ToDoListRequest> request = new ArrayList<>();
        List<String> listEventNames = toDoListDTO.events().stream()
                .map(ToDoEventDTO::name)
                .collect(Collectors.toList());
        request.add(new ToDoListRequest(toDoListDTO.name(), listEventNames));
        return request;
    }
}
