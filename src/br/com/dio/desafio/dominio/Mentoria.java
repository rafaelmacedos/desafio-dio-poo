package br.com.dio.desafio.dominio;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo{
    private LocalDateTime dataHora;

    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);
        this.dataHora = LocalDateTime.now();
    }

    @Override
    public double calcularXp() {
        return 0;
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
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dataHora=" + dataHora +
                '}';
    }
}
