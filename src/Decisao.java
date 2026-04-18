package aula02;

import javax.swing.JOptionPane;

public class Decisao {

    public static void item1() {
        // 1. IF que executa sempre
        if (true) {
            System.out.println("O sistema de decisão está ativo.");
        }

        // 2. Exemplo com booleano fixo
        boolean maiorIdadeOriginal = true;
        if (maiorIdadeOriginal) {
            System.out.println("Status: Maior de idade (definido via variável)");
        } else {
            System.out.println("Status: Menor de idade (definido via variável)");
        }

        // 3. Exemplo Real com entrada do usuário
        String input = JOptionPane.showInputDialog("Qual a sua idade?");
        int idade = Integer.parseInt(input);

        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Você é Maior de idade!");
            System.out.println("Resultado: Maior de idade (" + idade + " anos)");
        } else {
            JOptionPane.showMessageDialog(null, "Você é Menor de idade!");
            System.out.println("Resultado: Menor de idade (" + idade + " anos)");
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

        switch(diaDaSemana){
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
                System.out.println("SEGUNDA");
                break;
            case 3:
                System.out.println("TERÇA");
                break;
            case 4:
                System.out.println("QUARTA");
                break;
            case 5:
                System.out.println("QUINTA");
                break;
            case 6:
                System.out.println("SEXTA");
                break;
            case 7:
                System.out.println("SÁBADO");
                break;
            default:
                System.out.println("Opção inválida");
                        }

     // EXEMPLO RETIRANDO O BREAK
     int nps = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua nota (1 a 5): "));
        switch(nps){
            case 1:
            case 2:
                System.out.println("DETRATOR");
                break;
            case 3:
                System.out.println("NEUTRO");
                break;
            case 4:
            case 5:
                System.out.println("PROMOTOR");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
