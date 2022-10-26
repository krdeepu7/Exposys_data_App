package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class data_sci_explore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_sci_explore);


    }

    public void apply_data_sci(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://exposysdata.com/registration.php"));
        startActivity(intent);
    }
}