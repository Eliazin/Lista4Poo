/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista4ex1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();

        int opc = 0;
        String nome, ra, curso, anoConclusao, anoConclusaoPos;
        char opcao = 0;
        Object[] arrayCurso = {"Graduacao", "Pos Graduacao"};
        while (opc != 3) {
           
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir Aluno\n2 - Exibir Aluno\n3 - Sair"));

            switch (opc) {
                case 1:
                    nome = JOptionPane.showInputDialog("Nome do aluno: ");
                    ra = JOptionPane.showInputDialog("Ra do aluno: ");
                    curso = JOptionPane.showInputDialog("Curso do aluno: ");
                    opcao = JOptionPane.showInputDialog(null, "Selecione o Tipo do Curso", "Selecione",
                            JOptionPane.INFORMATION_MESSAGE, null, arrayCurso, arrayCurso[0]).toString().charAt(0);
                    if (opcao == 'G') {
                        anoConclusao = JOptionPane.showInputDialog("Ano de Conclusao: ");
                        alunos.add(new alunoGraduacao(anoConclusao, ra, nome, curso));
                    } else if(opcao == 'P') {
                        anoConclusaoPos = JOptionPane.showInputDialog("Ano de Conclusao: ");
                        alunos.add(new alunoPosGraduacao(anoConclusaoPos, ra, nome, curso));
                    }
                    break;
                case 2:
                    String msg = "";
                    for (Aluno a : alunos) {
                    msg += a.toString()+ "\n" + "\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Sistema Finalizado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
                    break;
            }
        }
    }
}