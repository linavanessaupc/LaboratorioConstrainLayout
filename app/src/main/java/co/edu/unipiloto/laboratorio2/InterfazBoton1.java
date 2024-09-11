package co.edu.unipiloto.laboratorio2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

public class InterfazBoton1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boton_uno);
    }

    public void OnClick(View view) {
        Intent intent=new Intent(this, InterfazBoton2.class);
        startActivity(intent);
    }
}