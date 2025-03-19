package com.hugo.TaskTracker.service;

import com.hugo.TaskTracker.model.Task;
import com.hugo.TaskTracker.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    //Método de listar (GET)
    public List<Task> showTasks(){
        return taskRepository.findAll();
    }

    //Método de criar (POST)
    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    //Método de deletar (DELETE)
    public void deleteTask(Long id){ taskRepository.deleteById(id); }
}
