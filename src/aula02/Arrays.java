package aula2;

public class Arrays {

    public static void item1() {

        //Declarando e inicializando Arrays
        int[] pedrasSorteadas = {1, 20, 22, 56, 58, 60}; //Sempre tera 5 elementos
        String cores[] = {"Vermelho", "Preto", "Branco"};

        //Acessando os elementos do Array
        System.out.println(pedrasSorteadas[0]);
        System.out.println(pedrasSorteadas[1]);
        System.out.println(pedrasSorteadas[2]);
        System.out.println(pedrasSorteadas[3]);
        System.out.println(pedrasSorteadas[4]);
        System.out.println(pedrasSorteadas[5]);
        //System.out.println(pedrasSorteadas[6]); //DARIA RUIM

        //Alterando um elemento do Array
        cores[0] = "Azul";
        System.out.println(cores[0]);
        System.out.println(cores[1]);
        System.out.println(cores[2]);



    }

    public static void item2() {
        // Declarando array sem inicializar - VOCÊ SEMPRE PRECISA FALAR O TAMANHO DO ARRAY
        String[]passageiros = new String[5];

        passageiros[0] = "Naruto";
        passageiros[1] = "Sasuke";
        passageiros[2] = "Sakura";
        passageiros[3] = "Kakashi";
        passageiros[4] = "Tsunade";

    }

    public static void item3(){
            //Arrays multidimensionais

            String[] linha = {"vazio","vazio","vazio"}
            String[][] quadro = {{"vazio","vazio","vazio"}, {"vazio","vazio","vazio"}, {"vazio","vazio","vazio"}};
            quadro[0][0] = "X";
            quadro[0][1] = "X";
            quadro[0][2] = "X";


        //
        }

    }
}