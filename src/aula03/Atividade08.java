package aula03;
import javax.swing.JOptionPane;

public class Atividade08 {
    public static void ControleIdade() {
                String input = JOptionPane.showInputDialog("Digite sua idade:");
                int idade = Integer.parseInt(input);
                String resultado = (idade >= 16) ? "Entrada liberada" : "Entrada não permitida";
                JOptionPane.showMessageDialog(null, resultado);
            }
}