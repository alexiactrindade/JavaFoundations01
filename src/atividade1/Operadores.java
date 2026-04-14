package atividade1;

import java.util.Scanner;

public class Operadores {
    
    public static void item1(){
        
        //Operadores aritimeticos (+ - * / %)
        
        int primeiroNumero = 10;
        int segundoNumero = 3;
        
        //SOMA
        int soma = primeiroNumero + segundoNumero;          //Resultado: 13
        int subtracao = primeiroNumero - segundoNumero;     //Resultado: 7
        int multiplicacao = primeiroNumero * segundoNumero; //Resultado: 30
        int divisao = primeiroNumero / segundoNumero;       //Resultado: 3
        int resto = primeiroNumero % segundoNumero;         //Resultado: 1
        
        //casting - Converter um tipo int para um tipo double
        double divisaoDecimal = (double) primeiroNumero / segundoNumero;
        
        System.out.println("NUMEROS: " + primeiroNumero + " e " + segundoNumero);
        System.out.println("SOMA: " + soma );
        System.out.println("SUBTRAÇÃO: " + subtracao );
        System.out.println("MULTIPLICAÇÃO: " + multiplicacao );
        System.out.println("DIVISÃO: " + divisao + " (Inteiro)");
        System.out.println("DIVISÃO: " + divisaoDecimal + " (Decimal)");
        System.out.println("MODULO: " + resto );
        
    }
    
    public static void item2(){
        //Operadores relacionais (== != > < >= <=)

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero1 = teclado.nextInt();
        System.out.print("Digite outro numero: ");
        int numero2 = teclado.nextInt();

        System.out.println(numero1 + " == " +numero2 + ": " + simNao(numero1 == numero2) );
        System.out.println(numero1 + " != " +numero2 + ": " + (numero1 != numero2) );
        System.out.println(numero1 + " > " +numero2 + ": " + (numero1 > numero2) );
        System.out.println(numero1 + " < " +numero2 + ": " + (numero1 < numero2) );
        System.out.println(numero1 + " >= " +numero2 + ": " + (numero1 >= numero2) );
        System.out.println(numero1 + " <= " +numero2 + ": " + (numero1 <= numero2) );
        
    }
    
    static String simNao(boolean valor){
        //Para casa!!!
    }
    
}
