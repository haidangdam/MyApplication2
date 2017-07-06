package com.example.haidangdam.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.mylibrary.MainActivityLibrary;

public class MainActivity extends AppCompatActivity {
  MainActivityLibrary mainActivityLib;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mainActivityLib = MainActivityLibrary.newInstance();
    getFragmentManager().beginTransaction().add(R.id.frame_layout, mainActivityLib).commit();
  }
}
