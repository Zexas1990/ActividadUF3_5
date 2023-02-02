package com.dam.actividaduf3_5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class JavaFragment extends Fragment {

    TextView tvJava;

    public JavaFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_java, container, false);

        tvJava = view.findViewById(R.id.tvJavaFragment);
        tvJava.setTextSize(TypedValue.COMPLEX_UNIT_SP, MainActivity.TAM);

        return view;
    }
}