package br.com.alura;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as Colecoes do Java", "Paulo Silveira");

//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 15));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 21));


//        List<Aula> aulas = javaColecoes.getAulas();
//        System.out.println(aulas);
//
//        aulas.add(new Aula("Trabalhando com ArrayList", 21));
//        System.out.println(aulas);
        System.out.println(javaColecoes.getAulas());

//        System.out.println(aulas == javaColecoes.getAulas());
    }
}

/** Informações sobre Listas, ArraysList e LinkedList
 *
 * Quando você adiciona alguma coisa numa lista, ela respeita a ordem e pode incluir números repetidos,
 * independente do tipo de lista.
 *
 * O ArrayList acessa os objetos de maneira aleatória rapidamente. Muito usado pra listas longas e quando
 * você trabalha várias vezes aquela lista. É fácil de inserir elementos no final.
 *
 * Pra acessar elementos no meio ou no começo utiliza-se LinkedList, pois trabalha com referências.
 * Ela é muito rápida pra remover ou inserir em qualquer lugar, porém é lenta buscar um elemento por
 * índice pois precisa percorrer a lista inteira.
 */
