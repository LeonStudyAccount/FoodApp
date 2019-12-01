package com.example.foodapp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.foodapp.R;

public class FilterFragment extends Fragment {


    View root;

    TextView textView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //Folgende Reihenfolge beim Aufrufen: onCreate() -> onCreateView() -> onStart()
        //Besonderheit: alle Views (TextView, Button, Image, Map, ...) müssen über root.findViewByID() definiert werden!!!

        root = inflater.inflate(R.layout.fragment_filter, container, false);
        textView = root.findViewById(R.id.text_home);

        textView.setText("FilterFragment");

        return root;
    }
}