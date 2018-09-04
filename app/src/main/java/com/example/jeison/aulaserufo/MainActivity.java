package com.example.jeison.aulaserufo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.security.Principal;

public class MainActivity extends AppCompatActivity {
    private Button btnOK;
    private EditText edtText;
    private int[] imagem={R.drawable.crianca,R.drawable.adolescente,R.drawable.adulto,R.drawable.velho};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView teste= findViewById(R.id.imageView);
        btnOK = findViewById(R.id.botao);
        edtText= findViewById(R.id.texto);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=0;
                try {
                    i = Integer.parseInt(edtText.getText().toString());

                 //  AlertDialog.Builder dig = new AlertDialog.Builder(MainActivity.this);

                    if (i <= 12) {
                      //  dig.setIcon(R.drawable.crianca);
                       // dig.setMessage("Criança");
                        teste.setImageResource(imagem[0]);
                    } else if (i > 12 && i < 18) {
                      //  dig.setIcon(R.drawable.adolescente);
                        teste.setImageResource(imagem[1]);

                     //   dig.setMessage("Adolescente");
                    } else if (i >= 18 && i < 60) {
                     //   dig.setIcon(R.drawable.adulto);
                     //   dig.setMessage("Adulto");
                        teste.setImageResource(imagem[2]);
                    } else {
                     //   dig.setIcon(R.drawable.velho);
                     //   dig.setMessage("Velho");
                        teste.setImageResource(imagem[3]);

                    }
                   // dig.setTitle("Idade");
                   // dig.setCancelable(false);
                   // dig.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                   //     @Override
                   //     public void onClick(DialogInterface dialog, int which) {

                  //      }
                   // }).show();
                }catch (Exception e){
                  /*  AlertDialog.Builder dig = new AlertDialog.Builder(MainActivity.this);
                    dig.setTitle("Idade");
                    dig.setMessage("Digite um valor valido!");
                    dig.setCancelable(false);
                    dig.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();*/
                }




            }
        });
    }
}
