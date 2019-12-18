package dao;

import domain.Task;

import java.util.List;

public interface TaskDao {

    List<Task> findTasks(String fileName);

}
