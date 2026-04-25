package aula03;

import javax.swing.JOptionPane;

public class Atividade07 {
    public static void AssistentePessoal() {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n1 - Saudação\n2 - Despedida\n3 - Piada"));

        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, "OLÁ MUNDO");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "BYE BYE");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "O que cai em pé e corre deitado? Chuva!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }
    }
}