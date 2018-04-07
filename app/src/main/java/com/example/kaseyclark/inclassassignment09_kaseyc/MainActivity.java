package com.example.kaseyclark.inclassassignment09_kaseyc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testRef.setValue("Olive");

    }
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference cowRef = database.getReference("cow");
    private DatabaseReference testRef = database.getReference("tester");



    public void set(View view) {
        cowRef.setValue(new Cow(true, 7, "Betsy"));
    }
}


