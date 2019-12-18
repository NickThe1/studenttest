package dao;

import domain.Task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskDaoImpl implements TaskDao {

    public List<Task> findTasks(String fileName) {
        List<Task> tasks = new ArrayList();
        File inputFile = new File(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(inputFile);
        }
        catch (FileNotFoundException e){
            System.out.println("file is not found" + e);
        }

        while (scanner.hasNextLine()){
            tasks.add(new Task(scanner.nextLine(), scanner.nextLine()));
        }

        return tasks;
    }
}
