package kr.hs.emirim.qls6521.simpledialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but=(Button)findViewById(R.id.but_dialog);//대화상자를 나타내는 버튼의 아이디를 통해 불러옴
        but.setOnClickListener(this);//현재 이벤트 핸들러 클래스의 객체를 this라는 키워드로 대신함

    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);//액티비티의 문맥을 말하는것이다.-> 현재 액티비티 반환받는것 !!
        // 만약 this를 쓸 경우 현재 액티비티를 말하는 것
        dialog.setTitle("안녕 한빈!");
        dialog.setMessage("다이어트하자 살을빼자 밀가루끊자!");
        dialog.setIcon(R.drawable.first_icon);
        dialog.setPositiveButton("화긴!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"화긴을 누르다니! 현명해 <3",Toast.LENGTH_LONG).show();
            }//액티비티 객체의 this를 말하려고 하기때문에 . 만약 액티비티를 안써주면 onClick메소드가 this가 됨
        });//문자열,이벤트
        dialog.show();
    }
}
