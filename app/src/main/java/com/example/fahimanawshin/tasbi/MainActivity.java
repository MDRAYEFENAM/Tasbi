package com.example.fahimanawshin.tasbi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button reset;
    Button run;
    TextView count;
    int counter=0;
    RelativeLayout re;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reset=(Button)findViewById(R.id.reset);
        count=(TextView) findViewById(R.id.count);
        re=(RelativeLayout) findViewById(R.id.re);

        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                count.setText(""+counter);

            }

        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=0;
                count.setText(""+counter);

            }
        });

    }
}
