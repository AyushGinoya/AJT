/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3borquestion;

/**
 *
 * @author ginoy
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q3Or {
    public static void main(String[] args) {
        List<TodoItem> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding initial TODO tasks
        todoList.add(new TodoItem("Task 1", "Description for Task 1"));
        todoList.add(new TodoItem("Task 2", "Description for Task 2"));

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add a new TODO task");
            System.out.println("2. Mark a task as completed");
            System.out.println("3. Print pending TODOs");
            System.out.println("4. Print completed TODOs");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter TODO title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter TODO description:");
                    String description = scanner.nextLine();
                    TodoItem newTodo = new TodoItem(title, description);
                    todoList.add(newTodo);
                    break;
                case 2:
                    System.out.println("Enter the index of the task to mark as completed:");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < todoList.size()) {
                        TodoItem todo = todoList.get(index);
                        todo.setCompleted(true);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 3:
                    System.out.println("Pending TODOs:");
                    printTodos(todoList, false);
                    break;
                case 4:
                    System.out.println("Completed TODOs:");
                    printTodos(todoList, true);
                    break;
                case 5:
                    System.out.println("Exiting the TODO application.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void printTodos(List<TodoItem> todoList, boolean completed) {
        for (TodoItem todo : todoList) {
            if (todo.isCompleted() == completed) {
                System.out.println("Title: " + todo.getTitle());
                System.out.println("Description: " + todo.getDescription());
                System.out.println("Status: " + (completed ? "Completed" : "Pending"));
                System.out.println();
            }
        }
    }
}
