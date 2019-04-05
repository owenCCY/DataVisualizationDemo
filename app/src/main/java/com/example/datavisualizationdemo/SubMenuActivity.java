package com.example.datavisualizationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SubMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu);

        //Intent in = getIntent();
        //final int index = in.getIntExtra("com.example.datavisualizationdemo.PIC_INDEX", -1);
        Button graphBtn = (Button) findViewById(R.id.historyButton);
        graphBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), LineChartActivity.class);
                //startIntent.putExtra("com.example.datavisualizationdemo.PIC_INDEX", index);
                startActivity(startIntent);
            }
        });
        Button realTimeButton = (Button) findViewById(R.id.realTimeButton);
        realTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), LineChartActivity.class);
                //startIntent.putExtra("com.example.datavisualizationdemo.PIC_INDEX", 3);
                startActivity(startIntent);
            }
        });
        Button mapButton = (Button) findViewById(R.id.mapButton);
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), LineChartActivity.class);
                //startIntent.putExtra("com.example.datavisualizationdemo.PIC_INDEX", index);
                startActivity(startIntent);
            }
        });
    }

}
