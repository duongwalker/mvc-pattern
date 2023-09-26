package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TodoModel model = new TodoModel();
        TodoView view = new TodoView();
        TodoController controller = new TodoController(model, view);

        // This should be included as a method in View
        Scanner scanner = new Scanner(System.in);
        String s = "p";
        while (!s.isEmpty()) {
            System.out.println("Menu: ");
            System.out.println("1. Show tasks");
            System.out.println("2. Add tasks");
            System.out.println("3. Mark tasks as done");
            System.out.print("Your choice: ");
            s = scanner.nextLine();
            if (s.equals("1")) {
                controller.updateView();
            } else if (s.equals("2")) {
                String task = "1";
                while (!task.isEmpty()) {
                    System.out.print("Your task here, or null line to exit: ");
                    task = scanner.nextLine();
                    if(task.isEmpty()) break;
                    controller.addTasks(task);
                }
            } else if (s.equals("3")) {
                String task = "1";
                while (!task.isEmpty()) {
                    System.out.print("Finished task here, or null line to exit: ");
                    task = scanner.nextLine();
                    if(task.isEmpty()) break;
                    try {
                        controller.removeTask(task);
                    } catch (NullPointerException e) {
                        System.out.println("Task not available.");
                    }
                }
            }
        }
    }
}