package example.tasklist;


import java.util.Date;

public class TaskList {

    private Task task = new Task();

    public void addTask(String title, Date dueTo) {
        task.setTitle(title);
        task.setDueTo(dueTo);
    }

    public Task getTask() {
        return task;
    }
}
