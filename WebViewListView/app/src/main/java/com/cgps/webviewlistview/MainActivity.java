package com.cgps.webviewlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] Os={"Mac","Windows","Linux","BlackBerry","IOs","OxyGen","Emui"};
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView OsList=(ListView)findViewById(R.id.Os);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,Os);
        OsList.setAdapter(adapter);

        OsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String pos=adapterView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this,pos,Toast.LENGTH_SHORT).show();
            }
        });

    next =(Button)findViewById(R.id.button3);
    next.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View view) {


            Intent f = new Intent(MainActivity.this, Web.class);
            startActivity(f);
        }  });
    }}

