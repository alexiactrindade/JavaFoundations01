package aula03;

import javax.swing.*;

import javax.swing.JOptionPane;

public class Atividade02 {
    public static void jogoRPG() {
        int valorEnergia = Integer.parseInt(JOptionPane.showInputDialog("Qual é o valor da variação de energia?"));

        if (valorEnergia > 0) {
            JOptionPane.showMessageDialog(null, "A poção dá positivo");
        } else if (valorEnergia < 0) {
            JOptionPane.showMessageDialog(null, "A poção dá negativo");
        } else {
            JOptionPane.showMessageDialog(null, "A poção é nula");
        }
    }
}