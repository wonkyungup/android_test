package com.park.loginscene;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class personaltraining extends AppCompatActivity {
    private Button mypage;
    private Button home;
    private Button paypul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personaltraining);

        mypage=findViewById(R.id.mypage_button);
        home=findViewById(R.id.home_button);
        paypul=findViewById(R.id.pay);



        mypage.setOnClickListener(per);
        home.setOnClickListener(per);
        paypul.setOnClickListener(per);
    }
    View.OnClickListener per=new View.OnClickListener() {
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
                case R.id.pay:
                    Intent pay=new Intent(getApplicationContext(),pay_page.class);
                    startActivity(pay);
                    break;
            }
        }
    };
}
