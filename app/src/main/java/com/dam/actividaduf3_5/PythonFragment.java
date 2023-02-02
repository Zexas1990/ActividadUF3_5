package com.dam.actividaduf3_5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PythonFragment extends Fragment {

    TextView tvPython;

    public PythonFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_python, container, false);


        tvPython = view.findViewById(R.id.tvPyFragment);
        tvPython.setTextSize(TypedValue.COMPLEX_UNIT_SP, MainActivity.TAM);

        return view;    }
}