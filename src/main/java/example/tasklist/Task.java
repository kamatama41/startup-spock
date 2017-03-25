package example.tasklist;

import java.util.Date;

public class Task {
    private String title = "";
    private Date dueTo;

    public void setTitle(String title){
        this.title = title;
    }

    public String  getTitle(){
        return  this.title;
    }

    public Date getDueTo() {
        return dueTo;
    }

    public void setDueTo(Date dueTo) {
        this.dueTo = dueTo;
    }
}
