package lista4ex3;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Funcionario> funcionario = new ArrayList();
        ArrayList<Consultor> consultor = new ArrayList();

        int opc = 0;
        String nome, matricula;
        double salario;
        char opcao;
        float percentual;
        Object[] arrayFunc = {"Funcionario", "Consultor"};
        while (opc != 3) {

            opc = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1 - Cadastrar Funcionario\n"
                    + "2 - Mostrar Funcionario\n"
                    + "3 - Sair"));

            switch (opc) {
                case 1:
                    matricula = JOptionPane.showInputDialog("Matricula: ");
                    nome = JOptionPane.showInputDialog("Nome: ");
                    opcao = JOptionPane.showInputDialog(null, "Selecione o Tipo do Funcionario", "Selecione",
                            JOptionPane.INFORMATION_MESSAGE, null, arrayFunc, arrayFunc[0]).toString().charAt(0);
                    salario = Double.parseDouble(JOptionPane.showInputDialog("Salario: "));

                    switch (opcao) {
                        case 'F' -> {
                            funcionario.add(new Funcionario(matricula, nome, salario));
                            JOptionPane.showMessageDialog(null, Arrays.asList(funcionario.toString()));
                    }
                        case 'C' -> {
                            percentual = Float.parseFloat(JOptionPane.showInputDialog("Percentual de comissao: "));
                            funcionario.add(new Consultor(percentual, salario, matricula, nome));
                    }
                        default -> JOptionPane.showMessageDialog(null, "Não é um tipo de funcionario correto, ERRO" + JOptionPane.ERROR_MESSAGE);
                    }
                    break;


             case 2:
                    String msg = "";
                    for (Funcionario f : funcionario) {
                        msg += f.toString()+ "\n" + "\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Adieu");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inexistente, tente novamente");
                    continue;
            }
        }
    }

}
