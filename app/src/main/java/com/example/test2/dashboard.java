package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class dashboard extends AppCompatActivity {
    Button data_sci_exp_button, full_stack_exp_button, web_dev_exp_button, app_dev_exp_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        data_sci_exp_button = findViewById(R.id.data_sci_exp_btn);
        full_stack_exp_button = findViewById(R.id.full_stack_exp_btn);
        web_dev_exp_button = findViewById(R.id.web_dev_exp_btn);
        app_dev_exp_button = findViewById(R.id.app_dev_exp_btn);

data_sci_exp_button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), data_sci_explore.class);
        startActivity(intent);
    }
    });

    full_stack_exp_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent= new Intent(getApplicationContext(),full_stack_explore.class);
            startActivity(intent);
        }
});

    web_dev_exp_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent= new Intent(getApplicationContext(),web_dev_explore.class);
            startActivity(intent);
        }
    });

    app_dev_exp_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent= new Intent(getApplicationContext(),appDev_explore.class);
            startActivity(intent);
        }
    });

    }

}