package com.dam.actividaduf3_5;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class SizeDialog extends DialogFragment{
//Iniciar el dialogo
    EditText etSize;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState){
        View v = getActivity().getLayoutInflater().inflate(R.layout.dialog_size, null);
    }


}
