package com.cgps.webviewlistview;

import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Ratingg extends AppCompatActivity {
 private RatingBar rate;
 private TextView text;
 private Button submit;
 TextView comment;
 EditText feedback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingg);
        rate = (RatingBar) findViewById(R.id.ratingBar);
        text = (TextView) findViewById(R.id.textView);
        rate.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar rate, float rating, boolean fromUser) {
                text.setText(String.valueOf(rating));

            }
        });
        submit=(Button)findViewById(R.id.button7);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comment = (TextView) findViewById(R.id.textView2);
                feedback = (EditText) findViewById(R.id.editText2);
                String message = feedback.getText().toString();
                Toast.makeText(Ratingg.this, message, Toast.LENGTH_SHORT).show();

            }
        });
        }}


