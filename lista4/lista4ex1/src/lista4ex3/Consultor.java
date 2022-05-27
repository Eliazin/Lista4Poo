package lista4ex3;

public class Consultor extends Funcionario {

    private float percentual;
    private double salario;

    public Consultor() {
    }

    public Consultor(float percentual, double salario, String matricula, String nome) {
        super(matricula, nome);
        this.percentual = percentual;
        this.salario = salario;
    }

    public Consultor(double salario, String matricula, String nome) {
        super(matricula, nome);
        this.salario = salario + 100;

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public float getPercentual() {
        return percentual;
    }

    public void setPercentual(float percentual) {
        this.percentual = percentual;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + (salario * percentual);
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario(float percentual) {
        return getSalario() + salario * percentual;

    }
}
