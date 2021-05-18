package br.com.alura;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    // o uso do polimorfismo é interessante pois se precisar trocar o tipo de objeto, posso fazer isso
    // futuramente. Aqui LinkedList está encapsulado/escondido.
    // Se referenciar pela forma mais genérica possível é uma boa prática. Nesse caso, o uso de list,
    // no lugar de Arraylist ou LinkedList.
    private List<Aula> aulas = new LinkedList<Aula>();
    // com LinkedHashSet, o retorno é na ordem em que foram matriculados os alunos. Na hora de percorrer com
    // foreach.
    // O TreeSet guarda os elementos na ordem natural, do Comparable.
    // Não é tão rápido como o HashSet, mas é mais rápido que a lista.
    private Set<Aluno> alunos = new HashSet<>();

    // O mapa associa a chave (key) ao Value, Map<K, V>, nesse exemplo <Matricula, Aluno>
    // O map também usa tabela de espalhamento. Faz uma busca certeira.
    // Utilizado pra listas grandes e possui uma performance excelente.
    // Pode-se usar o LinkedHashMap -> assim como o LinkedList, ele guarda a ordem em que foram inseridos os elementos.
    private Map<Integer, Aluno> matriculaParaAlunos = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        // A lista não pode ser modificada(incluir, deletar, alterar não é possível)
        // Esse método não deixa ninguém mexer na lista. Read only.
        // Não quero que ninguém mecha nos meus atributos. Eles são privados.
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        // Usando o Java 8
        // Mapeia todos os objetos do tipo int, pegue o tempo deles e some.
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + "," +
                " aulas" + this.aulas + "]";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAlunos.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

//    método devolve um aluno dado uma matrícula/número
    public Aluno buscaMatricula(int numero) {
        if(!matriculaParaAlunos.containsKey(numero)){
            throw new NoSuchElementException("matricula não encontrada");
        }
        return matriculaParaAlunos.get(numero);
    }

        // pra cada aluno que eu tenho dentro do conjunto alunos, verifica se numero informado é igual a
        // matrícula do aluno. Se positivo, retorna esse aluno, caso contrário lança a exceção.
//      for (Aluno aluno : alunos) {
//          if(aluno.getNumeroMatricula() == numero) {
//              return aluno;
//          }
//      }
//        throw new NoSuchElementException("matricula do aluno não encontrada");
//    }
}
//        int tempoTotal = 0;
//        for (Aula aula: aulas) {
//            tempoTotal += aula.getTempo();
//        }
//        return tempoTotal;



