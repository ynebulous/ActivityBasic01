package android.sungjaewon.com.activitybasic01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_main);
    }
    public void openme (View v){

        Intent intent = new Intent(this,MainActivity.class);

        startActivity(intent);
    }
    }

