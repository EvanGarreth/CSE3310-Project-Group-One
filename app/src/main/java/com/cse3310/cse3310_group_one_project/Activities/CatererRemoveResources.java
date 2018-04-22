package com.cse3310.cse3310_group_one_project.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.cse3310.cse3310_group_one_project.Models.User;
import com.cse3310.cse3310_group_one_project.R;

/**
 * Created by Arsalan on 4/11/2018.
 */

public class CatererRemoveResources extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caterer_remove_resources);

        Button remove_resources_submit=findViewById(R.id.remove_resources_submit);
        Button remove_resources_back=findViewById(R.id.remove_resources_back);
        remove_resources_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                removeResourcesBack();
            }
        });
    }

    public void removeResourcesSubmit(){

    }

    public void removeResourcesBack(){
        Intent intent_back = new Intent(this,CatererEditEvent.class);
        int event_id = (int) getIntent().getSerializableExtra("EVENT_ID");
        intent_back.putExtra("EVENT_ID",event_id);
        User user = (User) getIntent().getSerializableExtra("USER");
        intent_back.putExtra("PREVIOUS_PAGE", (Class) getIntent().getSerializableExtra("PREVIOUS_PAGE"));
        intent_back.putExtra("USER", user);
        startActivity(intent_back);
    }
}
