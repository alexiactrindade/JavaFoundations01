package aula03;

import javax.swing.*;

public class EstruturasDeRepeticao {
    public static void item1() {
        //FOR
        // -> Quando sabemos quantas vezes vai repetir
        // -> Quando pretendemos usar o índice de um array

        //Contar de 0 a 10
        for (int i = 0; i < 10; i++) { // Variável de controle, idica onde vai começar; Define o limite de vezes; Regra para atualizar a variável de controle
            System.out.println(i);
        }
    }

    public static void item2() {
        // for
        // percorrer um array
        int[] numerosMegaSena = new int[10];

        for (int i = 0; i < 6; i++) {
            numerosMegaSena[i] = (int) (Math.random() * 60) + 1;
            System.out.println(numerosMegaSena[i]);
        }
    }

    public static void item3() {
        // for each
        // percorrer um array e fazer algo com cada elemento

        String[] alunos = {"Alexia", "Claudenez", "Ana Claudia", "Vinicius"};
        for (String aluno : alunos) {
            System.out.println("Você acabou de ficar bilionário(a), " + aluno);
        }
    }

    public static void item4() {
        // while
        // Quando temos uma condição específica para finalizar o loop
        // Não precisamos saber quantas vezes vai repetir

        int i = 0;
        while (i < 25) {
            System.out.println(i);
            i++;
        }
    }

    public static void item6() {
        int opcao;
        do {
            opcao = Integer.parseInt (JOptionPane.showInputDialog(("Digite um número entre 0 a 5")))
        } while (opcao != 0);
    }
}