package lista4ex1;

public class alunoGraduacao extends Aluno {
    private String anoConclusao;

    public alunoGraduacao() {
    }

    public alunoGraduacao(String anoConclusao, String ra, String nome, String curso) {
        super(ra, nome, curso);
        this.anoConclusao = anoConclusao;
    }

    public String getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(String anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    @Override
    public String toString(){
     return super.toString() + "\nAno de conclusão: " +anoConclusao;
     
    }
}
