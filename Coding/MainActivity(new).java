package com.example.password;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int pw1=-1, pw2=-1, pw3=-1, pw4=-1, a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    protected void Clicked1(View v) {

        if(a==0) {
            pw1=1;
            a=1;
        }else if (a == 1) {
            pw2=1;
            a=2;
        }else if (a == 2) {
            pw3=1;
            a=3;
        }else if (a == 3) {
            pw4=1;
            a=4;
        }else{}
    }


    protected void Clicked2(View v) {

        if(a==0) {
            pw1=2;
            a=1;
        }else if (a == 1) {
            pw2=2;
            a=2;
        }else if (a == 2) {
            pw3=2;
            a=3;
        }else if (a == 3) {
            pw4=2;
            a=4;
        }else{}
    }


    protected void Clicked3(View v) {

        if(a==0) {
            pw1=3;
            a=1;
        }else if (a == 1) {
            pw2=3;
            a=2;
        }else if (a == 2) {
            pw3=3;
            a=3;
        }else if (a == 3) {
            pw4=3;
            a=4;
        }else{}
    }


    protected void Clicked4(View v) {

        if(a==0) {
            pw1=4;
            a=1;
        }else if (a == 1) {
            pw2=4;
            a=2;
        }else if (a == 2) {
            pw3=4;
            a=3;
        }else if (a == 3) {
            pw4=4;
            a=4;
        }else{}
    }


    protected void Clicked5(View v) {

        if(a==0) {
            pw1=5;
            a=1;
        }else if (a == 1) {
            pw2=5;
            a=2;
        }else if (a == 2) {
            pw3=5;
            a=3;
        }else if (a == 3) {
            pw4=5;
            a=4;
        }else{}
    }


    protected void Clicked6(View v) {

        if(a==0) {
            pw1=6;
            a=1;
        }else if (a == 1) {
            pw2=6;
            a=2;
        }else if (a == 2) {
            pw3=6;
            a=3;
        }else if (a == 3) {
            pw4=6;
            a=4;
        }else{}
    }


    protected void Clicked7(View v) {
//        Toast.makeText(getApplicationContext(), "7", Toast.LENGTH_SHORT).show();
        if(a==0) {
            pw1=7;
            a=1;
        }else if (a == 1) {
            pw2=7;
            a=2;
        }else if (a == 2) {
            pw3=7;
            a=3;
        }else if (a == 3) {
            pw4=7;
            a=4;
        }else{}
    }

    protected void Clicked8(View v) {

        if(a==0) {
            pw1=8;
            a=1;
        }else if (a == 1) {
            pw2=8;
            a=2;
        }else if (a == 2) {
            pw3=8;
            a=3;
        }else if (a == 3) {
            pw4=8;
            a=4;
        }else{}
    }

    protected void Clicked9(View v) {

        if(a==0) {
            pw1=9;
            a=1;
        }else if (a == 1) {
            pw2=9;
            a=2;
        }else if (a == 2) {
            pw3=9;
            a=3;
        }else if (a == 3) {
            pw4=9;
            a=4;
        }else{}
    }

    protected void Clicked10(View v) {
        if(a==0) {
            a=0;
        }else if (a == 1) {
            pw1=-1;
            a=2;
        }else if (a == 2) {
            pw2=-1;
            a=3;
        }else if (a == 3) {
            pw3=-1;
            a=4;
        }else if (a==4){
            pw4=-1;
            a=3;
        }

    }

    protected void Clicked11(View v) {

        if(a==0) {
            pw1=0;
            a=1;
        }else if (a == 1) {
            pw2=0;
            a=2;
        }else if (a == 2) {
            pw3=0;
            a=3;
        }else if (a == 3) {
            pw4=0;
            a=4;
        }else{

        }



    }protected void Clicked12(View v) {

        if(pw1==3&&pw2==0&&pw3==6&pw4==5) {
            Toast.makeText(getApplicationContext(), "잠금해제", Toast.LENGTH_SHORT).show();
            finish();
            return ;
        }else{
            Toast.makeText(getApplicationContext(), "비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show();
            pw1=-1;
            pw2=-1;
            pw3=-1;
            pw4=-1;
            a=0;
        }


    }

}
