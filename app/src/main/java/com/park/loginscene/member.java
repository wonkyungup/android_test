package com.park.loginscene;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class member extends AppCompatActivity {
    private Button mypage;
    private Button home;
    private Button pt_button;
    private Button gt_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);

        mypage=findViewById(R.id.mypage_button);
        home=findViewById(R.id.home_button);
        pt_button=findViewById(R.id.pt_button);
        gt_button=findViewById(R.id.gt_button);

        mypage.setOnClickListener(mem);
        home.setOnClickListener(mem);
        pt_button.setOnClickListener(mem);
        gt_button.setOnClickListener(mem);
    }
    View.OnClickListener mem=new View.OnClickListener() {
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
                case R.id.pt_button:
                    Intent pt_b=new Intent(getApplicationContext(),PT.class);
                    startActivity(pt_b);
                    break;
                case R.id.gt_button:
                    Intent gt_b=new Intent(getApplicationContext(),GT.class);
                    startActivity(gt_b);
                    break;

            }
        }
    };
}
