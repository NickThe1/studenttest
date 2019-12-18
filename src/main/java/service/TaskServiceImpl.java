package service;

import dao.TaskDao;
import domain.Task;

import java.util.List;

public class TaskServiceImpl implements TaskService {
    private TaskDao taskDao;

    public TaskServiceImpl() {
    }

    public TaskServiceImpl(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    public TaskDao getTaskDao() {
        return taskDao;
    }

    public void setTaskDao(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    public List<Task> getTasks(String fileName) {
        return taskDao.findTasks(fileName);
    }
}
