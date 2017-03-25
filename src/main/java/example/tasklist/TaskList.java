package example.tasklist;


import java.util.Date;

public class TaskList {
    public void addTask(String title, Date dueTo) {
    }

    public Task getTask() {
        Task task = new Task();
        task.setTitle("タイトルです");
        task.setDueTo(new Date(2017, 2, 25));
        return task;
    }
}
