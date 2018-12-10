package mx.edu.itchetumal.dadm.dialogos;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAlerta;
    Button btnConfirmacion;
    Button btnSeleccion;
    Button btnRadio;
    Button btnCheck;
    Button btnPerso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OyenteClic objDetectaClic = new OyenteClic();
        //Obtener referencia
        btnAlerta = (Button) findViewById(R.id.btnAlerta);
        btnAlerta.setOnClickListener(objDetectaClic);
        btnConfirmacion = (Button) findViewById(R.id.btnConfirmacion);
        btnConfirmacion.setOnClickListener(objDetectaClic);
        btnSeleccion = (Button) findViewById(R.id.btnSeleccion);
        btnSeleccion.setOnClickListener(objDetectaClic);
        btnRadio = (Button) findViewById(R.id.btnRadio);
        btnRadio.setOnClickListener(objDetectaClic);
        btnCheck = (Button) findViewById(R.id.btnCheck);
        btnCheck.setOnClickListener(objDetectaClic);
        btnPerso = (Button) findViewById(R.id.btnPerso);
        btnPerso.setOnClickListener(objDetectaClic);

    }
    class OyenteClic implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            //Verifica el dialogo
            switch (v.getId()) {
                case R.id.btnAlerta:
                    DialogoAlerta dialogo1 = new DialogoAlerta();
                    dialogo1.show(fragmentManager, "tagAlerta");
                    Toast.makeText(MainActivity.this, "Dialog Alerta", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnConfirmacion:
                    DialogoConfirmacion dialogo2 = new DialogoConfirmacion();
                    dialogo2.show(fragmentManager, "tagConfirmacion");
                    Toast.makeText(MainActivity.this, "Dialog Confirmación", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnSeleccion:
                    DialogoSeleccion dialogo3 = new DialogoSeleccion();
                    dialogo3.show(fragmentManager, "tagSeleccion");
                    Toast.makeText(MainActivity.this, "Dialog Selección", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnCheck:
                    DialogoSeleccionCheck dialogo4 = new DialogoSeleccionCheck();
                    dialogo4.show(fragmentManager, "tagSeleccion");
                    Toast.makeText(MainActivity.this, "Dialog Selección", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnRadio:
                    DialogoSeleccionRadio dialogo5 = new DialogoSeleccionRadio();
                    dialogo5.show(fragmentManager, "tagPersonalizado");
                    Toast.makeText(MainActivity.this, "Dialog Personalizado", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}
