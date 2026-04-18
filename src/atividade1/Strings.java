package atividade1; // Certifique-se de que a pasta se chama 'atividade1'

import javax.swing.*; // Importa JOptionPane

public class Strings {

    public static void item1() {
        String nome1 = "Alexia";
        String sobrenome1 = "da Costa Trindade";

        String nomeCompleto1 = nome1 + " " + sobrenome1;
        String nomeCompleto2 = "Alexia da Costa Trindade";

        System.out.println("Nome 1: " + nomeCompleto1);
        System.out.println("Nome 2: " + nomeCompleto2);

        // Explicação: == compara referências de memória, .equals() compara o conteúdo
        System.out.println("Comparação com == : " + (nomeCompleto1 == nomeCompleto2));
        System.out.println("Comparação com .equals : " + (nomeCompleto1.equals(nomeCompleto2)));
    }

    public static void item2() {
        String nome = JOptionPane.showInputDialog("Informe seu nome completo: ");

        // Verificação para evitar erro caso o usuário cancele o JOptionPane
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nenhum nome foi digitado.");
            return;
        }

        System.out.println("Nome em CAIXA ALTA: " + nome.toUpperCase());
        System.out.println("Nome em CAIXA BAIXO: " + nome.toLowerCase());
        System.out.println("Primeira letra: " + nome.charAt(0));
        System.out.println("Quantidade de caracteres: " + nome.length());
        System.out.println("Última letra: " + nome.charAt(nome.length() - 1));

    }
}
