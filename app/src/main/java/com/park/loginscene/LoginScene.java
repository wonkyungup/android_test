package com.park.loginscene;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class LoginScene extends AppCompatActivity {

    private Button findid;
    private Button membership;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_scene);

        findid = (Button) findViewById(R.id.findid);
        membership = (Button)findViewById(R.id.membership);
        login = (Button)findViewById(R.id.login);

        findid.setOnClickListener(web);
        membership.setOnClickListener(web);
        login.setOnClickListener(web);
    }
    View.OnClickListener web = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch(view.getId()){
                case R.id.findid:
                    Intent findid = new Intent(Intent.ACTION_VIEW,Uri.parse("http://192.168.0.170:5000"));
                    startActivity(findid);
                    break;
                case R.id.membership:
                    Intent membership  = new Intent(Intent.ACTION_VIEW,Uri.parse("http://192.168.0.170:5000"));
                    startActivity(membership);
                    break;
                case R.id.login:
                    Intent login = new Intent(getApplicationContext(),Home.class);
                    startActivity(login);
                    break;

            }
        }
    };
}
