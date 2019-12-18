package service;

import domain.Task;

import java.util.List;

public interface TaskService {
    List<Task> getTasks(String fileName);
}
