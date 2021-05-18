package br.com.alura;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {
        // É possível por Set.
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo");
        alunos.add("Paulo");
        alunos.add("David");
        alunos.add("Andre");
        alunos.add("Bruno");

        alunos.remove("Bruno");

        boolean BrunoEstaMatriculado = alunos.contains("Bruno");
        System.out.println(BrunoEstaMatriculado);

        System.out.println(alunos);
        System.out.println(alunos.size());

        for(String aluno : alunos) {
            System.out.println(aluno);
        }

//        alunos.forEach(aluno -> {
//            System.out.println(aluno);
//        });

        List<String> alunosEmLista = new ArrayList<>(alunos);
        System.out.println(alunosEmLista);

    }
}

/** Características dos Conjuntos
 *
 * É mais rápido do que a lista. Não possui método get e não pode ordenar. Não posso pegar elemento por index
 * como na lista. É muito comum utilizar as duas collections juntas.
 * O conjunto não passa por todos os elementos, ele vai direto no elemento que vc quer.
 * Conjunto é muito utilizado se vc vai fazer muitas buscas. Quero saber se alguém está nesse conjunto, então
 * o indicado é o Hashset. É uma estrutura de dados assim como a lista, com as diferenças acima.
 * Conjuntos não aceitam elementos repetidos.
 * O Set possui uma tabela de espalhamento que acessa os elemento muito mais rápido.
 *
 */



