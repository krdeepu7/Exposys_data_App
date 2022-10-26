package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class full_stack_explore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_stack_explore);
    }

    public void apply_full_stack(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://exposysdata.com/registration.php"));
        startActivity(intent);
    }
}