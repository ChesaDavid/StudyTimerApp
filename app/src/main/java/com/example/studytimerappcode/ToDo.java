package com.example.studytimerappcode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class ToDo extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private FirebaseUser user;
    private FirebaseDatabase data;
    private LinearLayout addTask;
    private TextView add;
    private Button abort,addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_to_do);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//        for(int i = 0; i < 10; i++)
        addTask = findViewById(R.id.addContainer);
        add =  findViewById(R.id.plus);
        abort = findViewById(R.id.buttonAbort);
        addBtn = findViewById(R.id.buttonAdd);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTask.setVisibility(View.VISIBLE);
            }
        });
        if(addTask.getVisibility() == View.VISIBLE){
            abort.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    addTask.setVisibility(View.GONE);
                }
            });
            addBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
        });
    }
    }
    public void addTaskButtonPressed(){

    }
}
//I have to make the todo app connect with firebase show what I have in the database as tasks and make the function to add