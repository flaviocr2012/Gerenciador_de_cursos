package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);
        System.out.println(aulas);

        // Para cada String aula dentro de aulas, faça algo.
        for(String aula: aulas) {
            System.out.println("Aula: " + aula);
        }

        // Maneiras de percorrer uma lista usando o método get.
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula);

        for(int i = 0; i < aulas.size(); i++) {
            System.out.println("aula : " + aulas.get(i));
        }

        System.out.println(aulas.size());

        // Método foreach -> performa uma ação pra cada elemento da interface Iterable
        // pra cada aula dentro da lista aulas, imprima...
        // o lambda(->) dá uma ordem
        aulas.forEach(aula -> {
            System.out.println("percorrendo : " + aula);
        });

        aulas.add(aula1);
        aulas.add("Aumentando o nosso conhecimento");
        Collections.sort(aulas);
        System.out.println(aulas);
    }
}
