package com.example.sergiorodriguez.venalau_app;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.crud.entities.Persona;
import com.crud.modelo.ModeloPersona;

public class RegistroActivity extends AppCompatActivity {

    EditText nombrePersona;
    EditText apellidoPersona;
    EditText idInstitucional;
    EditText correoInstitucional;
    EditText contraseña;
    EditText confirmarContraseña;
    Button botonRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        try{
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_registro);

            nombrePersona=(EditText) findViewById(R.id.txtNombreRegistro);
            apellidoPersona=(EditText) findViewById(R.id.txtApellidoRegistro);
            idInstitucional=(EditText) findViewById(R.id.txtIDRegistro);
            correoInstitucional=(EditText) findViewById(R.id.txtCorreoRegistro);
            contraseña=(EditText) findViewById(R.id.txtContraseñaRegistro);
            confirmarContraseña=(EditText) findViewById(R.id.txtConfirmarRegistro);
            botonRegistrar=(Button) findViewById(R.id.btnRegistrarse);

        }catch (Exception e){

            AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
            builder.setMessage(e.getMessage());
            builder.create().show();
        }


    }

    public void OnClickbtnRegistrarse(View v){
        try{
            Persona datos = new Persona();
            datos.setNombre(nombrePersona.getText().toString());
            datos.setApellido(apellidoPersona.getText().toString());
            datos.setIdPersona(Integer.parseInt(idInstitucional.getText().toString()));
            datos.setCorreo(correoInstitucional.getText().toString());
            datos.setContraseña(contraseña.getText().toString());

            boolean result = new HttpRequestAdd().execute(datos).get();
            if(result){
                Intent intent = new Intent(RegistroActivity.this, MainActivity.class);
                startActivity(intent);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
                builder.setMessage("Failed");
                builder.create().show();
            }

        }catch (Exception e){
            AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
            builder.setMessage(e.getMessage());
            builder.create().show();
        }

    }

    private class HttpRequestAdd extends AsyncTask<Persona, Void, Boolean> {


        @Override
        protected Boolean doInBackground(Persona... datos) {

            ModeloPersona datosModel = new ModeloPersona();

            return datosModel.create(datos[0]);
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
        }
    }
}
