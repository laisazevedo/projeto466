package com.example.projeto466;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.projeto466.Adapter.AnuncioAdapter;
import com.example.projeto466.modelos.Anuncio;

public class lista_anuncioActivity extends AppCompatActivity {

    private RecyclerView rv_anuncio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_anuncio);
        rv_anuncio = findViewById(R.id.rv_anuncio);
        atualizarViews();

    }
    private void atualizarViews() {
        AnuncioAdapter adapter = new AnuncioAdapter(this, Anuncio.getAnucio());
        rv_anuncio.setAdapter(adapter);
        rv_anuncio.setLayoutManager(new LinearLayoutManager(this));
    }
}