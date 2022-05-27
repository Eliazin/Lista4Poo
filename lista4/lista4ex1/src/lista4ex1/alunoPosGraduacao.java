package lista4ex1;

public class alunoPosGraduacao extends Aluno {

    private String anoConclusaoPos;

    public alunoPosGraduacao(String anoConclusaoPos) {
        this.anoConclusaoPos = anoConclusaoPos;
    }

    public alunoPosGraduacao(String anoConclusaoPos, String ra, String nome, String curso) {
        super(ra, nome, curso);
        this.anoConclusaoPos = anoConclusaoPos;
    }

    public String getAnoConclusaoPos() {
        return anoConclusaoPos;
    }

    public void setAnoConclusaoPos(String anoConclusaoPos) {
        this.anoConclusaoPos = anoConclusaoPos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAno de conclusão: " + anoConclusaoPos;
    }

}
