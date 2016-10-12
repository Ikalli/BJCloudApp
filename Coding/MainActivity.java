package com.example.password;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Password extends AppCompatActivity {
    private long lastTimeBackPressed;

    int ViewButton1=0,ViewButton2=0,ViewBotton3=0,ViewBotton4=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
    }

    public void onBackPressed(){

        if(System.currentTimeMillis()-lastTimeBackPressed < 1500 ){
            finish();
            return ;
        }
        Toast.makeText(this , "종료하시려면 한번 더 누르시오." , Toast.LENGTH_SHORT).show();
        lastTimeBackPressed = System.currentTimeMillis();
    }

    protected void Clicked1(View v) {
        Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
    }protected void Clicked2(View v) {
        Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
    }protected void Clicked3(View v) {
        Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
    }protected void Clicked4(View v) {
        Toast.makeText(this, "4", Toast.LENGTH_SHORT).show();
    }protected void Clicked5(View v) {
        Toast.makeText(this, "5", Toast.LENGTH_SHORT).show();
    }protected void Clicked6(View v) {
        Toast.makeText(this, "6", Toast.LENGTH_SHORT).show();
    }protected void Clicked7(View v) {
        Toast.makeText(this, "7", Toast.LENGTH_SHORT).show();
    }protected void Clicked8(View v) {
        Toast.makeText(this, "8", Toast.LENGTH_SHORT).show();
    }protected void Clicked9(View v) {
        Toast.makeText(this, "9", Toast.LENGTH_SHORT).show();
    }protected void Clicked10(View v) {
        Toast.makeText(this, "R키를 누르면 다시 재시작할수 재시작할수 재시작할수있어요", Toast.LENGTH_SHORT).show();
    }protected void Clicked11(View v) {
        Toast.makeText(this, "0", Toast.LENGTH_SHORT).show();
    }protected void Clicked12(View v) {
        Toast.makeText(this, "잠금해제", Toast.LENGTH_SHORT).show();
        finish();
        return ;
    }
}
