package com.example.projeto466.Adapter;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget. Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

import com.example.projeto466.AnuncioDetalhesActivity;
import com.example.projeto466.R;
import com.example.projeto466.modelos.Anuncio;


public class AnuncioAdapter extends RecyclerView.Adapter<AnuncioAdapter.AnuncioViewHolder>{
    TextView txt_bairro, txt_data, txt_descricao, txt_titulo, txt_preco;



    private Context context;
    private List<Anuncio> anuncios;

    public AnuncioAdapter(Context context, List<Anuncio> anuncios) {
        this.context = context;
        this.anuncios = anuncios;
    }

    @NonNull
    @Override
    public AnuncioViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int attachToRoot) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_item__anuncio, viewGroup, false);
        AnuncioViewHolder viewHolder = new AnuncioViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AnuncioViewHolder anuncioViewHolder, int posicao) {

        Anuncio anuncio = anuncios.get(posicao);
        anuncioViewHolder.txt_titulo.setText(anuncio.getTitulo());
        anuncioViewHolder.text_preco.setText("R$ " + anuncio.getPreço());
        anuncioViewHolder.text_bairro.setText(anuncio.getBairro());
        anuncioViewHolder.text_descricao.setText(anuncio.getDescrição());
        anuncioViewHolder.text_data.setText(anuncio.getData());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class AnuncioViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txt_titulo;
        TextView text_bairro;
        TextView text_data;
        TextView text_descricao;
        TextView text_preco;

        public AnuncioViewHolder(@NonNull View itemView) {
            super(itemView);

            // Binding
            txt_titulo = itemView.findViewById(R.id.txt_titulo);
            txt_bairro= itemView.findViewById(R.id.txt_bairro);
            txt_data = itemView.findViewById(R.id.txt_data);
            txt_preco = itemView.findViewById(R.id.txt_preco);
            txt_descricao= itemView.findViewById(R.id.txt_descricao);

           itemView.setOnClickListener(this);


                }


        @Override
        public void onClick(View v) {
            int posicao=getAdapterPosition();
            Anuncio anuncio =anuncios.get(posicao);
            Intent intent = new Intent(context, AnuncioDetalhesActivity.class);

            context.startActivity(intent);
            intent.putExtra("titulo","");
            intent.putExtra("bairro","");
            intent.putExtra("descricao","");
            intent.putExtra("data","");
            intent.putExtra("preco","86");

        }
    }
    }


