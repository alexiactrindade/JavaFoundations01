package atividade1; // Certifique-se de que a pasta se chama 'atividade1'

import javax.swing.*; // Importa JOptionPane

public class Strings {

    // O método main é o ponto de entrada do programa
    public static void main(String[] args) {
        // Você pode escolher qual item quer executar chamando o método aqui
        System.out.println("--- Executando Item 1 ---");
        item1();

        System.out.println("\n--- Executando Item 2 ---");
        item2();

        System.out.println("\n--- Executando Item 3 ---");
        item3();

        System.out.println("\n--- Executando Item 5 ---");
        item5();
    }

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

        int primeiroEspaco = nome.indexOf(" ");

        if (primeiroEspaco != -1) {
            String primeiroNome = nome.substring(0, primeiroEspaco);
            String sobrenome = nome.substring(primeiroEspaco).trim();
            System.out.println("Primeiro nome: " + primeiroNome);
            System.out.println("Restante do nome: " + sobrenome);
        } else {
            System.out.println("Você digitou apenas um nome: " + nome);
        }

        try {
            String idadeString = JOptionPane.showInputDialog("Informe sua idade: ");
            String idadeStringMae = JOptionPane.showInputDialog("Informe a idade da sua mãe: ");

            int idadeInt = Integer.parseInt(idadeString);
            int idadeIntMae = Integer.parseInt(idadeStringMae);

            System.out.println("Soma das idades: " + (idadeInt + idadeIntMae));
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite apenas números para as idades.");
        }
    }

    public static void item3() {
        try {
            String x = JOptionPane.showInputDialog("Informe o valor de x: ");
            String y = JOptionPane.showInputDialog("Informe o valor de y: ");

            double xDouble = Double.parseDouble(x);
            double yDouble = Double.parseDouble(y);

            double media = (xDouble + yDouble) / 2.0;

            JOptionPane.showMessageDialog(null, "A média entre os valores é: " + media);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na entrada de dados.");
        }
    }

    public static void item5() {
        // Curiosidade: Java faz cache de Integers entre -128 e 127
        Integer numero1 = 10;
        Integer numero2 = 10;

        System.out.println("numero1 (10) == numero2 (10)? " + (numero1 == numero2));

        // Se fossem números grandes (ex: 200), o resultado de == seria false!
        Integer n3 = 200
        Integer n4 = 200;
        System.out.println("n3 (200) == n4 (200)? " + (n3 == n4)); // Isso dará false
        System.out.println("Sempre use .equals para objetos: " + n3.equals(n4));
    }
}