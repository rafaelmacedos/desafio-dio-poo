package br.com.dio.desafio.dominio;

import java.time.LocalDateTime;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDateTime dataHora;

    public Mentoria() {
    }

    public Mentoria(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataHora = LocalDateTime.now();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataHora=" + dataHora +
                '}';
    }
}
