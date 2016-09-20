package android.sungjaewon.com.activitybasic01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by user on 2016-09-20.
 * 수동으로 Activity 만들기
 *
 * 1. Activity 클래스 상속
 * 2. OnCreate 메서드를 오버라이드
 * 3. OnCreate 메서드 안에서 레이아웃.xml을 setContentView 함수로 세팅
 */
public class Activity3 extends Activity {
    private static final String TAG = "Activity 3";

    @Override    // 1. 엑티비티 생성시 호출되는 함수
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "called onCreate");
        setContentView(R.layout.activity_3);
        // 우클릭 - generate - Override Method에서 private으로 가져옴
    }
    public void openActivity4 (View v){
            Intent intent = new Intent(this,Activity4.class);
            startActivity(intent);
    }



    public void openActivity5 (View v){
            Intent intent = new Intent(this,Activity5.class);
            startActivity(intent);
    }



    @Override // 2. 화면에 나타나기 바로 전에 호출되는 함수
    protected void onStart() {
        super.onStart();
        //System.out.println("Tag""called onStart");
        Log.i(TAG, "called onStart"); //==> 디버깅을 위해 systemout 출력하지만 앱성능에 영향이있으므로 log.i로 디버깅 확인
    }

    @Override // 3. 이 때 사용자가 화면에 입력할 수 있게 된다.
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "called onResume");
    }

    // 엑티비티가 동작하고 있는 중

    @Override // 4. 화면에서 사라졌을 때 <다른 엑티비티가 나(현재 엑티비티)를 가리고 있을 때> ex) 반투명
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "called onPause");
    }

    @Override // 5. 화면에서 사라졌을 때
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "called onStop");
    }

    @Override // 5.1. Stop되었던 Activity가 다시 호출될 때
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "called onRestart");
    }

    @Override // 6. 메모리에서 해제되었을 때 (앱 종료)
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "called onDestroy");
    }

}
