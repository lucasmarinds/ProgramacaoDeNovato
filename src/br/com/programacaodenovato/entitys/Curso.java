package br.com.programacaodenovato.entitys;

import java.rmi.NoSuchObjectException;
import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList();
    private Set<Estudante> alunos = new HashSet<>();
    private HashMap<Integer,Estudante> mapaEstudantes = new HashMap<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    /**
     * Pelo get como ele me retorna minha LISTA logo posso utilizar os métodos dele, apartir do get e isso é errado
     * por isso utilizamos do método unmodifiableList da lib Collections que ele retonar uma mesma lista com os mesmos
     * valores da lista que foi passada para ele mas apenas readonly que é apenas para leitura se for tentar utilizar
     * algum método ele lhe lançara uma exception, isso faz com que o código seja mais claro que o getCurso é apenas para
     * mostrar o que tem dentro de nossa lista e se formos manipular a lista que seja pela propria lista criada e que foi
     * passada para nosso curso.
     */
    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

    public Set<Estudante> getAlunos() {return Collections.unmodifiableSet(alunos); }

    public void setAlunos(Set<Estudante> alunos) {
        this.alunos = alunos;
    }

    public void matricularAluno(Estudante estudante) {
        this.alunos.add(estudante);
        this.mapaEstudantes.put(estudante.getId(), estudante);
    }

    public boolean alunoEstaMatriculado(Estudante aluno) {
        return this.alunos.contains(aluno);
    }

    /**
     * Utilizando HashMap para fazer essa busca.
     * @param id que vai vir para procurar a identidade do aluno.
     * @return retorna o aluno apartir da identidade dada e se a identidade não existir voltara null.
     */
    public Estudante buscaPorIdentidade(int id){
        if(mapaEstudantes.containsKey(id)) {
            return mapaEstudantes.get(id);
        }
        throw new NoSuchElementException("Este Aluno não existe");
    }

//    método que busca aluno por ID sem utilizar HashMap<K,V>
//    public Estudante buscaPorIdentidade(int id){
//        for(Estudante aluno : alunos){
//            if(aluno.getId() == id){
//                return aluno;
//            }
//        }
//        throw new NoSuchElementException("Não existe aluno com esse id");
//    }
}
