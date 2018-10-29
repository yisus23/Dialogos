package mx.edu.itchetumal.dadm.dialogos;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;



public class AlertaDialogo extends DialogFragment {

    Button btn1;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btn1 = (Button) btn1.findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setMessage("Esto es un dialogo").setTitle("Dialogo").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.create();
            }
        });




    }



}
