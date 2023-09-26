package org.example;

import java.util.List;

/**
 * TodoController is used to handle requests from users sent via TodoView
 */

public class TodoController {
    TodoModel todoModel;
    TodoView todoView;
    TodoController(TodoModel todoModel, TodoView todoView) {
        this.todoModel = todoModel;
        this.todoView = todoView;
    }
    // Add new task(s) to the list
    void addTasks(String... tasks) {
        for (String task : tasks) {
            todoModel.addTask(task);
        }
        this.updateView();
    }
    // Remove task (should be called when a task is marked as done)
    void removeTask(String task) throws NullPointerException {
        todoModel.removeTask(task);
        this.updateView();
    }
//    Return a list of tasks
    List<String> getTasks() {
        return todoModel.getTasks();
    }
    // Update view with provided method
    void updateView() {
        todoView.showTasks(this.getTasks());
    }
}
