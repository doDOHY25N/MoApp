package com.example.moapp.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;


import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moapp.GoalActivity;
import com.example.moapp.R;
import com.example.moapp.adapter.TodoAdapter;
import com.example.moapp.decoration.SetItemDecoration;
import com.example.moapp.model.Goal;
import com.example.moapp.model.Schedule;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;


public class AddGoalActivity extends Activity {
    private TimePicker timePicker;
    private Button startButton;
    private Button endButton;
    private FirebaseAuth mAuth;
    private DatabaseReference databaseReference;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_add);

        EditText goalTitle = findViewById(R.id.goal_title);
        EditText descriptionEditText = findViewById(R.id.goal_descriptionEditText);
        TextView save = findViewById(R.id.goal_save);
        TextView cancel = findViewById(R.id.goal_cancel);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AddGoalActivity.this, GoalActivity.class);
                Goal goal = new Goal();
                goal.setTitle(goalTitle.getText().toString().trim());
                goal.setDescription(descriptionEditText.getText().toString().trim());
                intent.putExtra("title", goalTitle.getText().toString().trim());
                intent.putExtra("description", descriptionEditText.getText().toString().trim());
                startActivity(intent);
            }
        });


    }

}
