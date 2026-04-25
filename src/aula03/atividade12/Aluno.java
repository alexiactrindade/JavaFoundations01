package aula03.atividade12;

import javax.swing.JOptionPane;

public class Aluno {
    public static void cadastrarHeroi() {
        String nome = JOptionPane.showInputDialog("Digite o nome do herói:");
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº da matrícula:"));
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 1ª nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 2ª nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a 3ª nota:"));

        double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

        String situacao;
        if (media >= 7.0) {
            situacao = "Aprovado";
        } else if (media >= 5.0) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }

        String mensagem = situacao.equals("Aprovado") ? "Parabéns!" : "Estude mais!";

        JOptionPane.showMessageDialog(null,
                "Nome: " + nome +
                        "\nMatrícula: " + matricula +
                        "\n\nNotas:\nP1: " + nota1 +
                        "\nP2: " + nota2 +
                        "\nP3: " + nota3 +
                        "\n\nMédia: " + String.format("%.2f", media) +
                        "\nSituação: " + situacao +
                        "\n\n" + mensagem);
    }

}