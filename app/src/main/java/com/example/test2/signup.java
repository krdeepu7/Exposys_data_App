package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {

    TextInputLayout fullname_var, username_var, email_var, mobno_var, password_var;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);


        fullname_var = findViewById(R.id.fullname_textfield_design);
        username_var = findViewById(R.id.username_textfield_design);
        email_var = findViewById(R.id.email_textfield_design);
        mobno_var = findViewById(R.id.mobile_textfield_design);
        password_var = findViewById(R.id.password_textfield_design);

    }

    public void home_screen(View view) {
        Intent intent = new Intent(getApplicationContext(), login.class);
        startActivity(intent);
        finish();
    }

    public void registerBtnClick(View view) {

        String fullname_ = fullname_var.getEditText().getText().toString();
        String username_ = username_var.getEditText().getText().toString();
        String email_ = email_var.getEditText().getText().toString();
        String mobno_ = mobno_var.getEditText().getText().toString();
        String password_ = password_var.getEditText().getText().toString();


        if (!fullname_.isEmpty()) {
            fullname_var.setError(null);
            fullname_var.setErrorEnabled(false);

            if (!username_.isEmpty()) {
                username_var.setError(null);
                username_var.setErrorEnabled(false);

                if (!email_.isEmpty()) {
                    email_var.setError(null);
                    email_var.setErrorEnabled(false);

                    if (!mobno_.isEmpty()) {
                        mobno_var.setError(null);
                        mobno_var.setErrorEnabled(false);

                        if (!password_.isEmpty()) {
                            password_var.setError(null);
                            password_var.setErrorEnabled(false);

                            if (email_.matches("^(.+)@(.+)$")) {
                                email_var.setError(null);
                                email_var.setErrorEnabled(false);

                                if (password_.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$")) {
                                    password_var.setError(null);
                                    password_var.setErrorEnabled(false);
                                    firebaseDatabase = FirebaseDatabase.getInstance();
                                    reference = firebaseDatabase.getReference("admin");


                                    String fullname_s = fullname_var.getEditText().getText().toString();
                                    String username_s = username_var.getEditText().getText().toString();
                                    String email_s = email_var.getEditText().getText().toString();
                                    String phonenumber_s = mobno_var.getEditText().getText().toString();
                                    String password_s = password_var.getEditText().getText().toString();

                                    storingData storingdatass = new storingData(fullname_s,username_s,email_s,phonenumber_s,password_s);
                                    reference.child(username_s).setValue(storingdatass);

                                    Toast.makeText(getApplicationContext(), "Registered Successfully ", Toast.LENGTH_SHORT).show();

                                    Intent intent = new Intent(getApplicationContext(), dashboard.class);
                                    startActivity(intent);
                                   finish();


                                } else {
                                    password_var.setError("At least 8 chars\n" +
                                            "\n" +
                                            "Contains at least one digit\n" +
                                            "\n" +
                                            "Contains at least one lower alpha char and one upper alpha char");
                                }

                            } else {
                                email_var.setError("Invalid email");
                            }


                        } else {
                            password_var.setError("Enter Password");
                        }

                    } else {
                        mobno_var.setError("Enter mobile Number");
                    }

                } else {
                    email_var.setError("Enter Email");
                }

            } else {
                username_var.setError("Enter username");
            }

        } else {
            fullname_var.setError("Please Enter the username");
        }


    }
}







