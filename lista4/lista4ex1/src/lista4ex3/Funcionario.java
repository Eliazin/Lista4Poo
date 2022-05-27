package lista4ex3;

public class Funcionario {

    private String matricula;
    private String nome;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Funcionario(String matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario + (salario * 0.1);
    }

    public String toString() {
        return "Matricula: " + matricula
                + "\nNome: " + nome
                + "\nSalario: " + getSalario();
    
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
