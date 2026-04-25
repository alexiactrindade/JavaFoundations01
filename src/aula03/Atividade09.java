package aula03;

import javax.swing.JOptionPane;

public class Atividade09 {
    // NÃO tem main aqui!
    // É apenas uma classe com a lógica da calculadora
    public static void executarCalculadora() {
        String tipoCalculo = JOptionPane.showInputDialog("Qual é o cálculo que você deseja fazer?\n'+' - Soma\n'-' - Subtração\n'*' - Multiplicação\n'/' - Divisão");

        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y"));
        double resultado;

        switch (tipoCalculo) {
            case "+":
                resultado = x + y;
                JOptionPane.showMessageDialog(null, x + " + " + y + " = " + resultado);
                break;
            case "-":
                resultado = x - y;
                JOptionPane.showMessageDialog(null, x + " - " + y + " = " + resultado);
                break;
            case "*":
                resultado = x * y;
                JOptionPane.showMessageDialog(null, x + " * " + y + " = " + resultado);
                break;
            case "/":
                if (y != 0) {
                    resultado = x / y;
                    JOptionPane.showMessageDialog(null, x + " / " + y + " = " + resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "Número não pode ser dividido por zero");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida!");
                break;
        }
    }
}