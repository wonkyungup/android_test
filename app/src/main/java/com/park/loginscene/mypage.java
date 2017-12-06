package com.park.loginscene;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mypage extends AppCompatActivity {

    private Button infor;
    private Button schedule;
    private Button attendance;
    private Button physical;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        infor = (Button)findViewById(R.id.infor);
        schedule = (Button)findViewById(R.id.schedule);
        attendance = (Button)findViewById(R.id.attendance);
        physical = (Button)findViewById(R.id.physical);
        logout = (Button)findViewById(R.id.logout);

        infor.setOnClickListener(web);
        schedule.setOnClickListener(web);
        attendance.setOnClickListener(web);
        physical.setOnClickListener(web);
        logout.setOnClickListener(web);

    }
    View.OnClickListener web=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.infor:
                    Intent infor=new Intent(getApplicationContext(),information.class);
                    startActivity(infor);
                    break;
                case R.id.schedule:
                    Intent schedule=new Intent(getApplicationContext(), com.park.loginscene.schedule.class);
                    startActivity(schedule);
                    break;
                case R.id.attendance:
                    Intent att=new Intent(getApplicationContext(), com.park.loginscene.attendance.class);
                    startActivity(att);
                    break;
                case R.id.physical:
                    Intent phy=new Intent(getApplicationContext(), com.park.loginscene.physical.class);
                    startActivity(phy);
                    break;
                case R.id.logout:
                    Intent log = new Intent (getApplicationContext(), com.park.loginscene.LoginScene.class);
                    startActivity (log);
                    break;
            }
        }
    };



}
