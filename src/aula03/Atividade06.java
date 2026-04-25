package aula03;

import javax.swing.JOptionPane;

public class Atividade06 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite a temperatura do servidor em °F:");
        double temperaturaF = Double.parseDouble(input);
        double temperaturaC = (temperaturaF - 32) * 5 / 9;
        String status;

        if (temperaturaC < 20) {
            status = "Frio (monitorar)";
        } else if (temperaturaC <= 29) {
            status = "Normal";
        } else if (temperaturaC <= 39) {
            status = "Quente (aumentar ventilação)";
        } else if (temperaturaC <= 49) {
            status = "Crítico (reduzir carga)";
        } else {
            status = "Desligamento de emergência";
        }

        String resultado = String.format(
                "Temperatura em °F: %.1f\n" +
                        "Temperatura em °C: %.1f\n" +
                        "Status: %s",
                temperaturaF, temperaturaC, status
        );

        JOptionPane.showMessageDialog(null, resultado);
    }
}
