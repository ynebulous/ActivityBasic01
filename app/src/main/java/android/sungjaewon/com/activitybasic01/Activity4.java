package android.sungjaewon.com.activitybasic01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity4 extends AppCompatActivity { //AppcompatActivity를 상속받으면 Android Studio에 있는 테마 사용

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }
}
