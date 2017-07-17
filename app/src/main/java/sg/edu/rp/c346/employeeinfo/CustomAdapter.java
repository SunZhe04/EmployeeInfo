package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15039608 on 17/7/2017.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;

    ArrayList<todoItem> toDoList;

    public CustomAdapter(Context context, int resource, ArrayList<todoItem> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        toDoList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //standard code do not need to modify
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);

        //step 2 (code) obtain the UI and assign to variable
        TextView tvName = (TextView)rowView.findViewById(R.id.textViewName);
        TextView tvTitle = (TextView)rowView.findViewById(R.id.textViewTitle);
        TextView tvSalary = (TextView)rowView.findViewById(R.id.textViewSalary);

        //obtain the to-do item based on the position.
        todoItem currentItem = toDoList.get(position);

        //set the textview to display corresponding information
        tvName.setText(currentItem.getName());
        tvTitle.setText(currentItem.getTitle());
        tvSalary.setText(currentItem.getSalary());


        return rowView;
    }
}
