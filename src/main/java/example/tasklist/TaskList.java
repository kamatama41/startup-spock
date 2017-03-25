package example.tasklist;


import java.util.Date;

public class TaskList {

    Task task = new Task();

    public void addTask(String title, Date dueTo) {
        task.setTitle(title);
        task.setDueTo(dueTo);
    }

    public Task getTask() {
        task.setTitle(task.getTitle());
        task.setDueTo(task.getDueTo());
        return task;
    }
}
