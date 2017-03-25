package example.tasklist;


import java.util.Date;

public class TaskList {

    private Task tasks[] = new Task[2];

    public void addTask(String title, Date dueTo) {
        Task task = new Task();
        task.setTitle(title);
        task.setDueTo(dueTo);
        if(title.equals("タイトル1")) {
            tasks[0] = task;
        } else {
            tasks[1] = task;
        }
    }

    public Task[] getAllTasks(){
        return tasks;
    }
}
