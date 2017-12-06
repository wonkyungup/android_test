package com.park.loginscene;

import android.content.Intent;
import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class GT extends AppCompatActivity {
    private Button mypage;
    private Button home;
    private Button gt_pay;

   /* Button start;
    Button complete;
    Chronometer chrometer;
    RadioButton calander;
    RadioButton picker;
    CalendarView viewcal;
    TimePicker viewpick;
    TextView txt;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_gt );

        mypage = findViewById ( R.id.mypage_button );
        home = findViewById ( R.id.home_button );
        gt_pay = findViewById ( R.id.gt_pay );

        mypage.setOnClickListener ( gt );
        home.setOnClickListener ( gt );
        gt_pay.setOnClickListener ( gt );

        /*start = (Button) findViewById ( R.id.start );
        complete = (Button) findViewById ( R.id.complete );
        chrometer = (Chronometer) findViewById ( R.id.chronometer1 );
        calander = (RadioButton) findViewById ( R.id.calender );
        picker = (RadioButton) findViewById ( R.id.picker );
        viewcal = (CalendarView) findViewById ( R.id.calendarView1 );
        viewpick = (TimePicker) findViewById ( R.id.timePicker1 );
        txt = (TextView) findViewById ( R.id.result );

        calander.setOnCheckedChangeListener ( tet );
        picker.setOnCheckedChangeListener ( tet );
        start.setOnClickListener ( gt );
        complete.setOnClickListener ( gt );
*/
    }

    View.OnClickListener gt = new View.OnClickListener () {
        @Override
        public void onClick(View view) {
            switch (view.getId ()) {
                case R.id.mypage_button:
                    Intent page = new Intent ( getApplicationContext (), mypage.class );
                    startActivity ( page );
                    break;
                case R.id.home_button:
                    Intent home = new Intent ( getApplicationContext (), Home.class );
                    startActivity ( home );
                    break;
                case R.id.gt_pay:
                    Intent gt_pay = new Intent ( getApplicationContext (), pay_page.class );
                    startActivity ( gt_pay );
                    break;
               /* case R.id.start:
                    chrometer.setBase( SystemClock.elapsedRealtime());
                    chrometer.start();
                    chrometer.setTextColor( Color.RED);
                    break;
                case R.id.complete:
                    chrometer.stop();
                    chrometer.setTextColor(Color.RED);
                    java.util.Date curDate = new
                            java.util.Date(viewcal.getDate());
                    txt.setText(Integer.toString(1900 + curDate.getYear())
                            + "년" +
                            Integer.toString(1 +
                                    curDate.getMonth()) + "월" +
                            Integer.toString(curDate.getDate()) + "일" +
                            Integer.toString(viewpick.getCurrentHour()) + "시" +
                            Integer.toString(viewpick.getCurrentMinute()) + "분" + " 예약함");
                    break;*/
            }
        }
    };
    /*CompoundButton.OnCheckedChangeListener tet = new CompoundButton.OnCheckedChangeListener () {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if (b == true) {
                viewcal.setVisibility ( android.view.View.VISIBLE );
                viewpick.setVisibility ( android.view.View.INVISIBLE );
            }
        }
    };
    public boolean*/
}


