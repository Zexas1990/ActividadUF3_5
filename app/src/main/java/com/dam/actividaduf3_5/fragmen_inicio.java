package com.dam.actividaduf3_5;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class fragmen_inicio extends Fragment {

    TextView tvHola;


    public fragmen_inicio() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View vista = inflater.inflate(R.layout.fragment_fragmen_inicio, container, false);

        tvHola = vista.findViewById(R.id.tvHola);
        tvHola.setTextSize(TypedValue.COMPLEX_UNIT_SP, MainActivity.TAM);


        return vista;
    }
}