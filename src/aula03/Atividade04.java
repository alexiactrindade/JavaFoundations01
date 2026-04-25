package aula03;

import javax.swing.*;

public class Atividade04 {
    public static void nivelamentoMissoes() {
        int pontuacaoMissao = Integer.parseInt(JOptionPane.showInputDialog("Qual é a pontuação da missão?"));

        if (pontuacaoMissao >= 90 && pontuacaoMissao <= 100) {
            JOptionPane.showMessageDialog(null, "Você é um guardião da relíquia");
        } else if (pontuacaoMissao >= 80 && pontuacaoMissao <= 89) {
            JOptionPane.showMessageDialog(null, "Você é um caçador(a) de tesouros");
        } else if (pontuacaoMissao >= 70 && pontuacaoMissao <= 79) {
            JOptionPane.showMessageDialog(null, "Você é um batedor do mapa");
        } else if (pontuacaoMissao >= 60 && pontuacaoMissao <= 69) {
            JOptionPane.showMessageDialog(null, "Você é um aprendiz de trilha");
        } else if (pontuacaoMissao < 60 && pontuacaoMissao >= 0) {
            JOptionPane.showMessageDialog(null, "Você precisa repetir o treinamento da floresta");
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida! Valores devem estar entre 0 e 100");
        }
    }
}