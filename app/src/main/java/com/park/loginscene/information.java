package com.park.loginscene;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class information extends AppCompatActivity {

    private Button mypage;
    private Button home;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        mypage=findViewById(R.id.mypage_button);
        home=findViewById(R.id.home_button);
        save=findViewById(R.id.save);

        mypage.setOnClickListener(inf);
        home.setOnClickListener(inf);
        save.setOnClickListener(inf);
    }
    View.OnClickListener inf=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.mypage_button:
                    Intent page=new Intent(getApplicationContext(),mypage.class);
                    startActivity(page);
                    break;
                case R.id.home_button:
                    Intent home=new Intent(getApplicationContext(),Home.class);
                    startActivity(home);
                    break;
                case R.id.save:
                    Toast.makeText(information.this, "저장되었습니다", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
}
