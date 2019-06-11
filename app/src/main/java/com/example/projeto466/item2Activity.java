package com.example.projeto466;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class item2Activity extends AppCompatActivity {
    TextView txt_titulo, txt_preco, txt_descricao, txt_data, txt_bairro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item2);
        txt_titulo=findViewById(R.id.txt_titulo);
        txt_bairro=findViewById(R.id.txt_bairro);
        txt_descricao=findViewById(R.id.txt_descricao);
        txt_data=findViewById(R.id.txt_data);
        txt_preco=findViewById(R.id.txt_preco);
//pegar informações
        Intent it=getIntent();
        String titulo=it.getStringExtra("titulo");
        String bairro=it.getStringExtra("bairro");
        String descricao=it.getStringExtra("descricao");
        String preco=it.getStringExtra("preco");
        String data=it.getStringExtra("data");
//atualizar
        txt_titulo.setText(titulo);
        txt_preco.setText(preco);
        txt_data.setText(data);
        txt_descricao.setText(descricao);
        txt_bairro.setText(bairro);
    }
}