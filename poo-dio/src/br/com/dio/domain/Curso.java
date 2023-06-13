package br.com.dio.domain;

public class Curso extends Conteudo {
    private double caragaHoraria;

    @Override
    public double calcularXp() {
        return getXp() * caragaHoraria;
    }

    public double getCaragaHoraria() {
        return caragaHoraria;
    }

    public void setCaragaHoraria(double caragaHoraria) {
        this.caragaHoraria = caragaHoraria;
    }

    @Override
    public String toString() {
        return "Mentoria{ titulo = " + this.getTitulo() + ", descricao = " + this.getDescricao() + ", carga horaria = " + this.getCaragaHoraria();
    }
}
