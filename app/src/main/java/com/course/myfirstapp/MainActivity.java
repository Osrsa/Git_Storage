package com.course.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {    //콜백 함수
        super.onCreate(savedInstanceState);                 //기본 화면 구성
        setContentView(R.layout.activity_main);             //추가 내용 구성
        //추가 내용이 있다면 아래에 추가
        //...
    }

    public void sendMessage(View view) {
        //메인화면에서 버튼을 누를 때, 입력한 텍스트를 다음 화면에 전달
        Intent intent = new Intent(this,
                DisplayMessageActivity.class);
        EditText editText = (EditText)
                findViewById(R.id.editTextText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}