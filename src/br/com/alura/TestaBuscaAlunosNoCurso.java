package br.com.alura;

public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as Colecoes do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 13212);
        Aluno a2 = new Aluno("Pablo", 78945);
        Aluno a3 = new Aluno("Leonardo", 45654);
        Aluno a4 = new Aluno("Fabio", 78945);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);

        System.out.println(javaColecoes.getAlunos());
        System.out.println("Quem é o aluno com matricula 79845");
        Aluno aluno = javaColecoes.buscaMatricula(78945);
        System.out.println(aluno);



    }

}
