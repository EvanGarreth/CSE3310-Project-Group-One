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

public class CatererRemoveStaff extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caterer_remove_staff);
        //TODO: Submit button functionality
        Button remove_staff_submit=findViewById(R.id.remove_staff_submit);
        Button remove_staff_back=findViewById(R.id.remove_staff_back);
        remove_staff_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                removeStaffBack();
            }
        });
    }

    public void removeStaffSubmit(){

    }

    public void removeStaffBack(){
        Intent intent_removeStaffBack = new Intent(this,CatererEditEvent.class);
        User user = (User) getIntent().getSerializableExtra("USER");
        intent_removeStaffBack.putExtra("USER", user);
        startActivity(intent_removeStaffBack);
    }
}