package com.example.cnjnuedux2020101335;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=this.findViewById(R.id.button_1);
        EditText editText=this.findViewById(R.id.edit_text);
        TextView textView=this.findViewById(R.id.text_score);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String scores=editText.getText().toString();
                String []array=scores.split(",");
                game g=new game();
                for(int i=0;i<array.length;i++){
                    g.roll(Integer.parseInt(array[i]));
                }
                textView.setText("score is :"+g.score());
            }
        });
    }

}

