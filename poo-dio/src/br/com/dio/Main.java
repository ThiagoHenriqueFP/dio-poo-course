package br.com.dio;

import br.com.dio.domain.*;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Dev d1 = new Dev();
        Dev d2 = new Dev();
        d1.setName("joao");
        d2.setName("jonas");

        Conteudo cursoA = new Curso();
        Conteudo cursoB = new Curso();
        cursoA.setTitulo("curso a");
        cursoB.setTitulo("curso b");

        Conteudo mentA = new Mentoria();
        mentA.setTitulo("ment a");

        BootCamp bc = new BootCamp();
        Set<Conteudo> conteudosBC = new LinkedHashSet<>();
        conteudosBC.add(cursoA);
        conteudosBC.add(cursoB);
        conteudosBC.add(mentA);
        bc.setConteudos(conteudosBC);

        d1.inscreverBootcamp(bc);
        d2.inscreverBootcamp(bc);
    }
}
