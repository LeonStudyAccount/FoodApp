package com.example.foodapp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.foodapp.R;

public class ListFragment extends Fragment {

    View root;

    TextView textView;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //Folgende Reihenfolge beim Aufrufen: onCreate() -> onCreateView() -> onStart()
        //Besonderheit: alle Views (TextView, Button, Image, Map, ...) müssen über root.findViewByID() definiert werden!!!

        root = inflater.inflate(R.layout.fragment_list, container, false);
        textView = root.findViewById(R.id.text_dashboard);
        textView.setText("Hier könnte eine Liste stehen");

        return root;
    }
}