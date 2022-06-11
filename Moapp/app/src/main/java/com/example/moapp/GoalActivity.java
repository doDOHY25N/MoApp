package com.example.moapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.moapp.activity.AddGoalActivity;
import com.example.moapp.model.Goal;

import java.util.ArrayList;
import java.util.List;

public class GoalActivity extends Activity {

    private RecyclerView recyclerView;
    private List<Goal> Goal = new ArrayList<>();
    //private GoalAdapter goalAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_main);

        Intent intentGoal = getIntent();
        String title = intentGoal.getStringExtra("title");
        String description = intentGoal.getStringExtra("description");
        TextView goalTitle = (TextView) findViewById(R.id.plz);
        ImageView backImg = (ImageView) findViewById(R.id.back);
        Button goalAddBtn = (Button) findViewById(R.id.goalAddBtn);


        goalTitle.setText(title);
        backImg.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                finish();
            }
        });
        goalAddBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(GoalActivity.this, AddGoalActivity.class);
                startActivity(intent);
            }
        });
    }
}
