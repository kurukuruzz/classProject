package com.example.classproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WordListActivity extends AppCompatActivity implements View.OnClickListener {
    private Button wordBtn[] = new Button[10];
    private Integer[] btnId = {
            R.id.wordBtn1, R.id.wordBtn2, R.id.wordBtn3, R.id.wordBtn4, R.id.wordBtn5,
            R.id.wordBtn6, R.id.wordBtn7, R.id.wordBtn8, R.id.wordBtn9, R.id.wordBtn10
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_word);

        for(int i = 0; i < wordBtn.length; i++) {
            wordBtn[i] = (Button) findViewById(btnId[i]);
        }

        for(int i = 0; i < wordBtn.length; i++) {
            final int j = i;
            //wordBtn[j].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        //버튼별 db 데이터 처리 화면 연결
    }
}
