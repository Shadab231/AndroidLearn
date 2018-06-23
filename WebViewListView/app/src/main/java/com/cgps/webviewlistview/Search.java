package com.cgps.webviewlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Search extends AppCompatActivity {
    ListView listView;
    SearchView searchView;
    Button rate;
    TextView comment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        listView=(ListView)findViewById(R.id.lv);
        searchView=(SearchView)findViewById(R.id.sv);

        final ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add("The Dark Knight");
        arrayList.add("Thor Ragnarok");
        arrayList.add("Avengers");
        arrayList.add("Titanic");
        arrayList.add("Jurasic World");
        arrayList.add("X-Men The Day Of Future Past");
        arrayList.add("Logan");
        arrayList.add("Baby");

        final ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                if(arrayList.contains(s)){
                    arrayAdapter.getFilter().filter(s);
                }
                else
                {
                    Toast.makeText(Search.this,"Sorry! match not found",Toast.LENGTH_SHORT).show();
                }
                    {
                        return false;
                    }
                }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);
                return false;
            }
        });
              rate = (Button)findViewById(R.id.button5);
              rate.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      Intent rt =new Intent(Search.this,Ratingg.class);
                      startActivity(rt);
                  }
              });
    }
}
