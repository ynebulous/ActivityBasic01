package android.sungjaewon.com.activitybasic01;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //전화걸기
    public void openCall (View v){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:114"));
        //                                전화를 거는 명령어,,,tel:번호로 Uri parse해서 호출해줌
        startActivity(intent);

    }
    // 문자보내기
    public void openSMS (View v){
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:01033536105"));
        //                                문자보내는 명령어,,,smsto:번호로 Uri parse해서 문자보내줌
        startActivity(intent);
    }

    //네이버띄우기기
    public void openNaver(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://naver.com"));
        //                                보여주는 명령어,,,해당주소를 Uri parse해서 문자보내줌
        startActivity(intent);
        //intent.ACTION 치면 실행 가능한 다양한 옵션이 있고, 구글링해서 공부할 것 !!!!!!!!!!!!!!!!!!
    }


    //Activity를 호출하는 함수
    //- 버튼에서 호출하기 위해 파라미터로 View를 설정해야만 함
    //- import해준 후에 layout창의 버튼 property에서 Onclick활성화
    public void openActivity (View v){
        // Acitivity를 호출하는 로직
        //1. 인텐트를 생성 :        ↓컨텍스트
        Intent intent = new Intent(this,Activity2.class);
                                      //↑호출할 엑티비티 클래스명 입력
                                      // 메모리에 올리기 위해서 .class붙임
        //2. 생성된 인텐트를 시스템에 넘겨서 실행 by startActivity
        startActivity(intent);
    }
}
