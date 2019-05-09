package sg.edu.rp.dmsd.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class DatabaseAdapter extends ArrayAdapter<Task> {
    private ArrayList<Task> task;
    private Context context;
    private TextView tvID;
    private TextView tvDesc;
    private TextView tvDate;

    public  DatabaseAdapter(Context context, int resource, ArrayList<Task> objects){
        super(context, resource, objects);

        task = objects;
        this.context = context;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.layout2,parent,false);

        tvID = rowView.findViewById(R.id.textViewID);
        tvDesc = rowView.findViewById(R.id.textViewDesc);
        tvDate = rowView.findViewById(R.id.textViewDate);

        Task currentTask = task.get(pos);
        return  rowView;
    }
}
