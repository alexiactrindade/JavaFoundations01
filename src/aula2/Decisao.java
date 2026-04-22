package aula2;

import javax.swing.*;

public class Decisao {

    public static void item1(){
        //IF ELSE
        /*
                if(condicao){
                    executa se verdadeiro
                }
                else{
                    executa se falso
                }

         */

        //SE EU TIVESSE UM IF QUE EXECUTA SEMPRE
        if(true){
            System.out.println("Verdadeiro");
        }

        //EXEMPLO COM UM BOOLEANO APENAS UMA CONDIÇÃO
        boolean maiorIdade = true;
        if(maiorIdade){
            System.out.println("Maior de idade"); //Executa se a condição for verdadeira
        }
        else{
            System.out.println("Menor de idade"); //Executa se a condição for falsa
        }

        //EXEMPLO COM RELACIONAIS APENAS UMA CONDIÇÃO
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade: "));
        if(idade >= 18){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }

        //EXEMPLO COM MAIS DE UMA CONDIÇÃO OPÇÃO 1
        if(idade>=0 && idade<12){
            System.out.println("É UMA CRIANÇA");
        }
        else if(idade>=65){
            System.out.println("É UM IDOSO");
        }
        else if(idade>=12 && idade<18){
            System.out.println("É UM ADOLESCENTE");
        }
        else if(idade>=18 && idade<65){
            System.out.println("É UM ADULTO");
        }

        //EXEMPLO COM MAIS DE UMA CONDIÇÃO OPÇÃO 2
        if(idade<12){
            System.out.println("É UMA CRIANÇA");
        }
        else if(idade < 18){
            System.out.println("É UM ADOLESCENTE");
        }
        else if(idade < 65){
            System.out.println("É UM ADULTO");
        }
        else{
            System.out.println("É UM IDOSO");
        }
        







    }

    public static void item2() {
        //SWITCH
        /*
                switch(variavel){
                    case valor1:
                        executa se for igual ao valor1
                        break;
                    case valor2:
                        executa se for igual ao valor2
                        break;
                }
        */

        int diaDaSemana = 4;

        switch (diaDaSemana) {

            case 1:
                System.out.println("DOM");
                break;
            case 2:
                System.out.println("SEG");
                break;
            case 3:
                System.out.println("TER");
                break;
            case 4:
                System.out.println("QUA");
                break;
            case 5:
                System.out.println("QUI");
                break;
            case 6:
                System.out.println("SEX");
                break;
            case 7:
                System.out.println("SAB");
                break;
            default:
                System.out.println("Opção inválida");

        }
    }

    public static void item3(){

        //EXEMPLO DE SWITCH RETIRANDO O BREAK

        int nps = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua nota (1 à 5): "));

        switch(nps){
            case 1:
            case 2:
                System.out.println("Detrator");
                break;
            case 3:
                System.out.println("Neutro");
                break;
            case 4:
            case 5:
                System.out.println("Promotor");
                break;
            default:
                System.out.println("Opção inválida, tente novamente");
        }

    }
    
    public static void item4(){
        //Operador Ternario
        
        /*
        condicao ? valorSeVerdadeiro : valorSeFalso;
         */
        
        int idade = 10;

        System.out.println( ((idade >= 18) ? "Maior" : "Menor") + " de idade" );
        
    }

}
