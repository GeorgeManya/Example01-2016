package com.example.ftsoporte.example01_2016;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Edtname1, Edtemail1;
    RadioButton Rbopcion11, Rbopcion22;



    String Opcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Edtname1 = (EditText) findViewById(R.id.Edtname);
        Edtemail1 = (EditText) findViewById(R.id.Edtemail);
        Rbopcion11 = (RadioButton)findViewById(R.id.rbopcion1);
        Rbopcion22 = (RadioButton)findViewById(R.id.rbopcion2);

        View.OnClickListener radio = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.rbopcion1:
                        Opcion="M";
                        break;
                    case R.id.rbopcion2:
                        Opcion="F";
                        break;
                }
            }
        };
        Rbopcion11.setOnClickListener(radio);
        Rbopcion22.setOnClickListener(radio);

    }
    public void ClickOk(View v){
        Toast.makeText(MainActivity.this,"Usuario: "+Edtname1.getText()+"\n"+ "Email: "+Edtemail1.getText()+"\n"+"Sexo: "+this.Opcion, Toast.LENGTH_SHORT).show();



    }



}