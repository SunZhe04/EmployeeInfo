package sg.edu.rp.c346.employeeinfo;

import java.util.Calendar;

/**
 * Created by 15039608 on 17/7/2017.
 */

public class todoItem {
    private String name;
    private String title;
    private String salary;

    public todoItem(String name, String title, String salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String toString(){
        return "ToDoItem("+
                "name='"+getName()+ "\'"+
                ",title="+getTitle()+
                ",salary="+getSalary()+
                '}';
    }
}
