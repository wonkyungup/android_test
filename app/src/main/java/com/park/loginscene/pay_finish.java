package com.park.loginscene;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pay_finish extends AppCompatActivity {
    private Button mypage;
    private Button home;
    private Button main_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_finish);

        mypage=findViewById(R.id.mypage_button);
        home=findViewById(R.id.home_button);
        main_button=findViewById(R.id.main_button);

        mypage.setOnClickListener(P_F);
        home.setOnClickListener(P_F);
        main_button.setOnClickListener(P_F);
    }
    View.OnClickListener P_F=new View.OnClickListener() {
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
                case R.id.main_button:
                    Intent main=new Intent(getApplicationContext(),Home.class);
                    startActivity(main);
                    break;
            }
        }
    };
}
