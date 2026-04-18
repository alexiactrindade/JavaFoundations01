package atividade1;

import java.util.Scanner;

public class Operadores {

    public static void item1() {
        int primeiroNumero = 10;
        int segundoNumero = 3;

        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        int divisao = primeiroNumero / segundoNumero;
        int resto = primeiroNumero % segundoNumero;

        // Casting correto para divisao decimal
        double divisaoDecimal = (double) primeiroNumero / segundoNumero;

        System.out.println("NUMEROS: " + primeiroNumero + " e " + segundoNumero);
        System.out.println("SOMA: " + soma);
        System.out.println("SUBTRAÇÃO: " + subtracao);
        System.out.println("MULTIPLICAÇÃO: " + multiplicacao);
        System.out.println("DIVISÃO: " + divisao + " (Inteiro)");
        System.out.println("DIVISÃO: " + divisaoDecimal + " (Decimal)");
        System.out.println("MODULO: " + resto);
    }

    public static void item2() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero1 = teclado.nextInt();
        System.out.print("Digite outro numero: ");
        int numero2 = teclado.nextInt();

        System.out.println(numero1 + " == " + numero2 + ": " + simNao(numero1 == numero2));
        System.out.println(numero1 + " != " + numero2 + ": " + simNao(numero1 != numero2));
        System.out.println(numero1 + " > "  + numero2 + ": " + simNao(numero1 > numero2));
        System.out.println(numero1 + " < "  + numero2 + ": " + simNao(numero1 < numero2));
        System.out.println(numero1 + " >= " + numero2 + ": " + simNao(numero1 >= numero2));
        System.out.println(numero1 + " <= " + numero2 + ": " + simNao(numero1 <= numero2));

        // Boa prática: fechar o scanner se não for mais usado
        // teclado.close();
    }

    public static void item3() {
        boolean eMaiorDeIdade = true; // Alterado para true para testar os outros IFs
        boolean temCursoSuperior = true;
        boolean temPosGraduacao = true;
        boolean temExperiencia = true;

        if (!eMaiorDeIdade) {
            System.out.println("Status: Bloqueado (Menor de idade)");
            return; // Encerra o método aqui se for menor
        }

        // Usando else if para selecionar apenas a categoria mais alta
        if (temCursoSuperior && temExperiencia && temPosGraduacao) {
            System.out.println("Habilitado para: DEV Sênior.");
        } else if (temCursoSuperior && temExperiencia) {
            System.out.println("Habilitado para: DEV Pleno.");
        } else if (temCursoSuperior || temExperiencia) {
            System.out.println("Habilitado para: DEV Jr.");
        } else {
            System.out.println("Não habilitado para cargos no momento.");
        }
    }

    public static void item4(){
        //Operadores de incremento e decremento (++ / --)

        int contador = 0;

        contador++;     // passa a valer 1
        contador++;     // passa a valer 2
        contador++;     // passa a valer 3
        System.out.println("contador: " + contador);
        contador--;
        System.out.println("contador: " + contador);

        int indice = 30;

        //pós incremento
        int indiceAnterior = indice++;

        System.out.println("indice: " + indice);
        System.out.println("indiceAnterior: " + indiceAnterior);

        //pré incremento
        int novoIndice = ++indice;
        System.out.println("indice: " + indice);
        System.out.println("Novo indice: " + novoIndice);

    }


    public static void item5() {
        // Operadores de atribuição
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Digite um número");
        numero1 = sc.nextInt();
        System.out.println("Digite outro número");
        numero2 = sc.nextInt();


        //10 2
        numero1 += numero2;
        System.out.println("numero1 += numero2");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);


        numero1 -= numero2;
        System.out.println("numero1 -= numero2");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);

        numero1 *= numero2;
        System.out.println("numero1 *= numero2");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);

        numero1 /= numero2;
        System.out.println("numero1 /= numero2");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);

        numero1 %= numero2;
        System.out.println("numero1 %= numero2");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);

    }

    static String simNao(boolean valor) {
        return valor ? "SIM" : "NÃO";
    }
}