package co.edu.unipiloto.laboratorio2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InterfazBoton2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boton_dos);
    }

    public void CambiarSiguiente(View view) {
        Intent intent=new Intent(this, InterfazBoton3.class);
        startActivity(intent);
    }

}
