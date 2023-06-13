package br.com.dio.domain;

public abstract class Conteudo {
    private static final double xp = 10d;
    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public double getXp() {
        return xp;
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

    public void setDescricao(String desricao) {
        this.descricao = desricao;
    }
}
