package co.edu.unipiloto.laboratorio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InterfazBoton4 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boton_cuatro);
    }

    public void CambiarSiguiente(View view) {
        Intent intent=new Intent(this, InterfazCorreo.class);
        startActivity(intent);
    }
}
