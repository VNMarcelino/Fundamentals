public class Professor {

    private String nome;
    private String disciplina;

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }

    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;

    }
}
