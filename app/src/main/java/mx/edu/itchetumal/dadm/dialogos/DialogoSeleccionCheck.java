package com.example.ivan_.dialogos;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.Log;
public class DialogoSeleccionCheck extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final String[] items = {"Español", "Inglés", "Francés"};
        AlertDialog.Builder builder =
                new AlertDialog.Builder(getActivity());
        builder.setTitle("Selección Check")
                .setMultiChoiceItems(items, null,
                        new DialogInterface.OnMultiChoiceClickListener() {
                            public void onClick(DialogInterface dialog, int item, boolean isChecked) {
                                Log.i("Dialogos", "Opción elegida: " + items[item]);
                            }
                        });
        return builder.create();
    }
}