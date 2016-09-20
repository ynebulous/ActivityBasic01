package android.sungjaewon.com.activitybasic01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void openActivity3(View v){
        Intent intent = new Intent (this,Activity3.class);
        startActivity (intent);
        //새로운 Activity 가 발생하면 AndroidManifest에 등록할 것
    }



}
