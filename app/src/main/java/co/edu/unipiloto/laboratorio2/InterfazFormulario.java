package co.edu.unipiloto.laboratorio2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InterfazFormulario extends AppCompatActivity {

    private EditText editTextNombreProyecto, editTextDescripcion, editTextResponsable, editTextPresupuesto;
    private Spinner spinnerLocalidad;
    private Button btnPublicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interfaz_formulario);

        editTextNombreProyecto = findViewById(R.id.proyecto_name);
        editTextDescripcion = findViewById(R.id.proyecto_descripcion);
        editTextResponsable = findViewById(R.id.proyecto_responsable);
        editTextPresupuesto = findViewById(R.id.proyecto_presupuesto);
        spinnerLocalidad = findViewById(R.id.localidad_spinner);
        btnPublicar = findViewById(R.id.botonPublicar);

        btnPublicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreProyecto = editTextNombreProyecto.getText().toString();
                String descripcion = editTextDescripcion.getText().toString();
                String responsable = editTextResponsable.getText().toString();
                String presupuesto = editTextPresupuesto.getText().toString();
                String localidad = spinnerLocalidad.getSelectedItem().toString();

                if (nombreProyecto.isEmpty() || descripcion.isEmpty() || responsable.isEmpty() || presupuesto.isEmpty() || localidad.isEmpty()) {
                    Toast.makeText(InterfazFormulario.this, "Por favor, complete todos los campos.", Toast.LENGTH_SHORT).show();
                } else {
                    String mensaje = "Proyecto: " + nombreProyecto + "\n" +
                            "Descripción: " + descripcion + "\n" +
                            "Responsable: " + responsable + "\n" +
                            "Presupuesto: " + presupuesto + "\n" +
                            "Localidad: " + localidad;

                    Toast.makeText(InterfazFormulario.this, "Proyecto publicado:\n" + mensaje, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

