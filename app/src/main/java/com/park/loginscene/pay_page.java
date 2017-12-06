package com.park.loginscene;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pay_page extends AppCompatActivity {
    private Button mypage;
    private Button home;
    private Button pay_FIN;
    private Button back_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_page);

        mypage=findViewById(R.id.mypage_button);
        home=findViewById(R.id.home_button);
        pay_FIN=findViewById(R.id.pay_FIN);
        back_button=findViewById(R.id.back_button);

        mypage.setOnClickListener(pap);
        home.setOnClickListener(pap);
        pay_FIN.setOnClickListener(pap);
        back_button.setOnClickListener(pap);
    }
    View.OnClickListener pap=new View.OnClickListener() {
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
                case R.id.pay_FIN:
                    Intent pay_finish=new Intent(getApplicationContext(), com.park.loginscene.pay_finish.class);
                    startActivity(pay_finish);
                    break;
                case R.id.back_button:
                    Intent back=new Intent(getApplicationContext(),Home.class);
                    startActivity(back);
                    break;
            }
        }
    };
}
