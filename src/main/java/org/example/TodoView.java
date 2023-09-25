package org.example;

import java.util.List;
public class TodoView {
    public void showTasks(List<String> tasks) {
        System.out.println("To-Do List:");
        int index = 1;
        for (String task : tasks) {
            System.out.println(index + ". " + task);
            index++;
        }
    }
}
