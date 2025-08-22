//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Escola escola = new Escola("Gestao Escolar");

        Aluno aluno1 = new Aluno("Carlos Silva", 19, "A123");
        Aluno aluno2 = new Aluno("Mariana Souza", 13, "A456");

        Professor professor1 = new Professor("João Pereira", "Matemática");
        Professor professor2 = new Professor("Ana Costa", "Português");

        escola.criaraluno(aluno1);
        escola.criaraluno(aluno2);

        escola.criarprofessor(professor1);
        escola.criarprofessor(professor2);

        escola.listadealunos();
        escola.listadeprofessor();

    }
}