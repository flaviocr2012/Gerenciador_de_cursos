package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as Colecoes do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        // Não preciso adicionar as novas aulas dentro desse array. A própria classe Collection já faz isso pra mim.
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        // Deu exception pois tentei alterar a ordem da lista.
        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());
        System.out.println(javaColecoes.getNome());
        System.out.println(javaColecoes);

    }
}
