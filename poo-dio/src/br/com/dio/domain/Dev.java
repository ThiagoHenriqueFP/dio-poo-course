package br.com.dio.domain;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(BootCamp bc){
        setConteudos(bc.getConteudos());
        bc.getDevs().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = getConteudosConcluidos().stream().findFirst();
        if (conteudo.isPresent()) {
            getConteudosConcluidos().add(conteudo.get());
            getConteudos().remove(conteudo.get());
        } else System.out.println("Nenhum curso matriculado");
    }

    public void calcularXp() {
        getConteudosConcluidos().stream().mapToDouble(Conteudo::calcularXp).sum();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos.addAll(conteudos);
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
}
