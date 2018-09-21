package cn.wxq.timepicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements BigCircleTimePicker.OnTimePickerListener, BigCircleTimePicker.OnTimeRangePickerListener {

    private CircleTimePicker mTimePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTimePicker = findViewById(R.id.circle_time_picker);
//        mTimePicker.setOnTimePickerListner(this);
//        mTimePicker.setOnTimeRangePickerListener(this);

        BigCircleTimePicker timePicker = findViewById(R.id.circle_time_big_picker);
        timePicker.setOnTimePickerListner(this);
        timePicker.setOnTimeRangePickerListener(this);

    }

    @Override
    public void onTime(int hour, int minute) {
        Log.d("Tag", String.format("选择的时间%d : %d", hour, minute));
    }

    @Override
    public void onRangeTime(int startHour, int startMinute, int endHour, int endMinute) {
        Log.d("Tag", String.format("选择的时间 睡觉 %02d:%02d --- 起床 %02d:%02d", startHour, startMinute, endHour, endMinute));
    }
}
