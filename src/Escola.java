import java.lang.reflect.Array;
import java.util.ArrayList;

public class Escola {

    private String nome;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;


    public Escola(String nome) {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.nome = nome;
    }


    public void criarprofessor(Professor professor) {
        professores.add(professor);
    }


    public void criaraluno(Aluno aluno) {
        alunos.add(aluno);
    }


    public void listadealunos() {
        System.out.println("Lista de Alunos");
        for (Aluno aluno : alunos) ;
        {
            System.out.println(alunos);
        }
    }


    public void listadeprofessor() {
        System.out.println("Lista de professor");
        for (Professor professor : professores) {
            System.out.println(professor);
        }
    }


}

