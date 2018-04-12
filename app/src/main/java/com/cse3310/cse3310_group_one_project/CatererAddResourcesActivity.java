package com.cse3310.cse3310_group_one_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Arsalan on 4/11/2018.
 */

public class CatererAddResourcesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caterer_add_resources);
        //TODO: submit button functionality
        Button add_resources_submit=findViewById(R.id.add_resources_submit);
        Button add_resources_back=findViewById(R.id.add_resources_back);
        add_resources_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addResourcesBack();
            }
        });
    }

    public void addResourcesSubmit(){

    }
    public void addResourcesBack(){
        Intent intent_removeStaffBack = new Intent(this,CatererEditEventActivity.class);
        startActivity(intent_removeStaffBack);
    }
}