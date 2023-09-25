package org.example;

import java.util.ArrayList;
import java.util.List;

public class TodoModel {
    private List<String> tasks;

    public TodoModel() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
