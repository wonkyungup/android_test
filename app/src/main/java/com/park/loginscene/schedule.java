package com.park.loginscene;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class schedule extends AppCompatActivity {
    private Button mypage;
    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        mypage =findViewById(R.id.mypage_button);
        home=findViewById(R.id.home_button);

        mypage.setOnClickListener(sche);
        home.setOnClickListener(sche);
    }
    View.OnClickListener sche=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.mypage_button:
                    Intent mypage=new Intent(getApplicationContext(), com.park.loginscene.mypage.class);
                    startActivity(mypage);
                    break;
                case R.id.home_button:
                    Intent home=new Intent(getApplicationContext(),Home.class);
                    startActivity(home);
                    break;
            }
        }
    };
}
