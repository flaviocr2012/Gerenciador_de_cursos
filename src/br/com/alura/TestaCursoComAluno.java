package br.com.alura;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as Colecoes do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 13212);
        Aluno a2 = new Aluno("Pablo", 78945);
        Aluno a3 = new Aluno("Leonardo", 45654);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);

        System.out.println("Todos os alunos matriculados: ");
//        javaColecoes.getAlunos().forEach(aluno -> {
//            System.out.println(aluno);
//        });

//        for(Aluno aluno1: javaColecoes.getAlunos()) {
//            System.out.println(javaColecoes.getAlunos());
//        }

        // Utilização da classe Iterator, é antiga, mas em algum momento, podemos esbarrar.
        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while(iterador.hasNext()) {
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }

        // Tem próximo?
//        iterador.hasNext();
        // Então me devolve o próximo
//        iterador.next();


        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo Turini", 13212);
        System.out.println(javaColecoes.estaMatriculado(turini));

        // Ao reescrever o equals, é necessário reescrever o hashcode.
        // O set espalha os objetos através de um número. ex: todos que começam com a letra R, possui o número 40.
        // Quando ele for procurar por um elemento, ele vai direto naquela "gaveta" onde tem os nomes com a letra R.

        System.out.println(a1.equals(turini));

        // Para o elemento ser considerado idêntico, eles precisam ter o mesmo código de espalhamento.
        System.out.println(a1.hashCode() == turini.hashCode());

//        System.out.println(javaColecoes.getAlunos());
    }

}
