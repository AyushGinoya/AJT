/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3borquestion;

import static javax.swing.UIManager.get;


/**
 *
 * @author ginoy
 */
public class TodoItem {
    private String title;
    private String description;
    private boolean completed;

    public TodoItem(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false; // Initially set to pending
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

