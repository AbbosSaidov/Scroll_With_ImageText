package com.example.abbos.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String[] NAMES={"Big b","B123","Bsdf","Bsdfdsf","Big 4","Big 5",
            "Big 6","Big 7","Big 8","Big9","Big 0",
            "Big 1","Big 2","Big 3","Big 4",
            "Big 5","Big 6","Big 7",};
    String[] Description={"Big b","B123","Bsdf","Bsdfdsf","Big 4","Big 5",
            "Big 6","Big 7","Big 8","Big9","Big 0",
            "Big 1","Big 2","Big 3","Big 4",
            "Big 5","Big 6","Big 7",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=findViewById(R.id.listView);

        CustomAdapter customAdapter =new CustomAdapter();
        listView.setAdapter(customAdapter);


    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return NAMES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view=getLayoutInflater().inflate(R.layout.customlayout,null);

            //ImageView imageView=findViewById(R)
            TextView textView_name=view.findViewById(R.id.textView_name);
            textView_name.setText(NAMES[i]);
            
            TextView textView_Description=view.findViewById(R.id.textView_Description);
            textView_Description.setText(Description[i]);
            return view;
        }
    }
}
