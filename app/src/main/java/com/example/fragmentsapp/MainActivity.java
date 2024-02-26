package com.example.fragmentsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      btn1=findViewById(R.id.button1);
   btn2=findViewById(R.id.button2);
btn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        loadFragment(new FirstFragment());
    }
});
btn2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        loadFragment(new Second_Fragment());
    }
});

    }

    public  void  loadFragment(Fragment fragment){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        //Replace layout with new fragment

        ft.replace(R.id.framelayout,fragment);
        ft.commit();
    }
}