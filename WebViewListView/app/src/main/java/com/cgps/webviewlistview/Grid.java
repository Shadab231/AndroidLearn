package com.cgps.webviewlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

public class Grid extends AppCompatActivity {
    Button hlw;
    String[] Os = {"Mac", "Windows", "Linux", "BlackBerry", "IOs", "OxyGen", "Emui"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        GridView OsList = (GridView) findViewById(R.id.Os);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Grid.this, android.R.layout.simple_list_item_1, Os);
        OsList.setAdapter(adapter);
        hlw=(Button)findViewById(R.id.button2);
        hlw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tab = new Intent(Grid.this, BtnWeb.class);
                startActivity(tab);
            }

        });
    }
}
