package com.example.jeison.aulaserufo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.security.Principal;

public class MainActivity extends AppCompatActivity {
    private Button btnOK;
    private EditText edtText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOK = findViewById(R.id.botao);
        edtText= findViewById(R.id.texto);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=0;
                try {
                    i = Integer.parseInt(edtText.getText().toString());

                    AlertDialog.Builder dig = new AlertDialog.Builder(MainActivity.this);

                    if (i <= 12) {
                        dig.setMessage("Criança");
                    } else if (i > 12 && i < 18) {
                        dig.setMessage("Adolescente");
                    } else if (i >= 18 && i < 60) {
                        dig.setMessage("Adulto");
                    } else {
                        dig.setMessage("Idoso");

                    }
                    dig.setTitle("Idade");
                    dig.setCancelable(false);
                    dig.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();
                }catch (Exception e){
                    AlertDialog.Builder dig = new AlertDialog.Builder(MainActivity.this);
                    dig.setTitle("Idade");
                    dig.setMessage("Digite um valor valido!");
                    dig.setCancelable(false);
                    dig.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();
                }




            }
        });
    }
}
