package example.tasklist;


import java.util.Date;

public class TaskList {

    private Task task = new Task();

    public void addTask(String title, Date dueTo) {
        task.setTitle(title);
        task.setDueTo(dueTo);
    }

    public Task[] getAllTasks(){
        Task tasks[];
        tasks = new Task[2];
        Task task0 = new Task();
        Task task1 = new Task();

        task0.setTitle("タイトル1");
        task0.setDueTo(new Date(2017, 2, 25));
        tasks[0] = task0;

        task1.setTitle("タイトル2");
        task1.setDueTo(new Date(2017, 2, 26));
        tasks[1] = task1;

        return tasks;
    }
}
