package com.example.mylibrary;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by haidangdam on 7/5/17.
 */

public class MainActivityLibrary extends Fragment {
  Button button;
  static MainActivityLibrary obj;
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.main_layout, container, false);
    button = (Button) view.findViewById(R.id.button);
    return view;
  }

  public MainActivityLibrary() {}

  public static MainActivityLibrary newInstance() {
    if (obj == null) {
      obj = new MainActivityLibrary();
    }
    return obj;
  }

}
