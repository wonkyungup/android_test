package com.park.loginscene;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.park.loginscene.R.id.home_button;
import static com.park.loginscene.R.id.mypage_button;

public class PT extends AppCompatActivity {
    private Button mypage;
    private Button home;
    private Button pt_pay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pt);

        mypage=findViewById(R.id.mypage_button);
        home=findViewById(R.id.home_button);
        pt_pay=findViewById(R.id.pt_pay);

        mypage.setOnClickListener ( pt );
        home.setOnClickListener(pt);
        pt_pay.setOnClickListener(pt);
    }
    View.OnClickListener pt=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case mypage_button:
                    Intent page=new Intent(getApplicationContext(),mypage.class);
                    startActivity(page);
                    break;
                case home_button:
                    Intent home=new Intent(getApplicationContext(),Home.class);
                    startActivity(home);
                    break;
                case R.id.pt_pay:
                    Intent pt_pay=new Intent(getApplicationContext(),pay_page.class);
                    startActivity(pt_pay);
                    break;
            }
        }
    };
}
