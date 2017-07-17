package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvToDo;
    ArrayList<todoItem> toDoIist;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvToDo=(ListView)findViewById(R.id.lvEmpolyee);
        toDoIist = new ArrayList<todoItem>();

        caToDo = new CustomAdapter(this, R.layout.item_row,toDoIist);
        lvToDo.setAdapter(caToDo);


        todoItem item1 = new todoItem("John","Software Technical Leader","3400.0");//create a ToDoItem object named item1
        toDoIist.add(item1);// add the ToDoitem object to the todolist arraylist

        todoItem item2 = new todoItem("May","Programmer","2200.0");//create a ToDoItem object named item1
        toDoIist.add(item2);
    }
}

