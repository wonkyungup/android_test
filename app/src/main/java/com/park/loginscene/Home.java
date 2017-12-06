package com.park.loginscene;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    private Button mypage;
    private Button home;
    private ImageButton member;
    private ImageButton personaltraining;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mypage = (Button)findViewById(R.id.mypage);
        home = (Button)findViewById(R.id.home);
        member = (ImageButton)findViewById(R.id.member);
        personaltraining = (ImageButton)findViewById(R.id.personaltraining);

        mypage.setOnClickListener(web);
        home.setOnClickListener(web);
        member.setOnClickListener(web);
        personaltraining.setOnClickListener(web);
    }

    View.OnClickListener web = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            switch (view.getId()){
                case R.id.mypage:
                    Intent mypage = new Intent(getApplicationContext(),mypage.class);
                    startActivity(mypage);
                    break;
                case R.id.home:
                    Intent home = new Intent(getApplicationContext(),Home.class);
                    startActivity(home);
                    break;
                case R.id.member:
                    Intent member = new Intent(getApplicationContext(),personaltraining.class);
                    startActivity(member);
                    break;
                case R.id.personaltraining:
                    Intent personaltraining = new Intent(getApplicationContext(),member.class);
                    startActivity(personaltraining);
                    break;

            }
        }
    };
}
