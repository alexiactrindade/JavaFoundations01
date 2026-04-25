package aula03.atividade11;

import javax.swing.JOptionPane;

public class Funcionario {
    public static void calculoSalario() {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        double salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário bruto:"));
        int horasExtras = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas extras trabalhadas:"));

        double valorHora = salarioBruto / 160;
        double valorHoraExtra = valorHora * 0.20;
        double totalHorasExtras = horasExtras * valorHoraExtra;
        double salarioComExtras = salarioBruto + totalHorasExtras;

        double descontoIR;
        if (salarioComExtras > 3000) {
            descontoIR = salarioComExtras * 0.15;
        } else {
            descontoIR = salarioComExtras * 0.075;
        }

        double salarioLiquido = salarioComExtras - descontoIR;

        JOptionPane.showMessageDialog(null, "O salário líquido é de: " + salarioLiquido);
    }
}
