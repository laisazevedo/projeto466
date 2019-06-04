package com.example.projeto466.modelos;
import java.util.ArrayList;
import java.util.List;
public class Anuncio {
        private String Titulo;
        private String Descrição;
        private Double preço;
        private String Data;
        private String Bairro;


        public Anuncio(String titulo, String descrição, Double preço, String data, String bairro) {
            Titulo = titulo;
            Descrição = descrição;
            this.preço = preço;
            Data = data;
            Bairro = bairro;
        }

        public static List<Anuncio> getAnucio() {
            List<Anuncio> Anuncio = new ArrayList<>();
            Anuncio.add(new Anuncio("Abajur em ótimo estado de uso", "Usado no máximo 4 vezes", 39.00, "12/12/2018", "Maravilha"));
            Anuncio.add(new Anuncio("Celular em ótimo estado de uso", "Usado no máximo 20 vezes", 300.00, "02/06/2019", "Boca De Barro"));
            Anuncio.add(new Anuncio("Mochila de Couro em ótimo estado", "Usada no máximo 9 vezes", 52.00, "12/05/2019", "Santo Antonio"));


            return Anuncio;

        }

        public String getTitulo() {
            return Titulo;
        }

        public void setTitulo(String titulo) {
            Titulo = titulo;
        }

        public String getDescrição() {
            return Descrição;
        }

        public void setDescrição(String descrição) {
            Descrição = descrição;
        }

        public Double getPreço() {
            return preço;
        }

        public void setPreço(Double preço) {
            this.preço = preço;
        }

        public String getData() {
            return Data;
        }

        public void setData(String data) {
            Data = data;
        }

        public String getBairro() {
            return Bairro;
        }

        public void setBairro(String bairro) {
            Bairro = bairro;
        }
    }

