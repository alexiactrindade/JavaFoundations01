package aula03;
import javax.swing.*;

public class Atividade01 {
        public static void entradaComJOption () {
            String nomeAstronauta = JOptionPane.showInputDialog("Olá, Astronauta! Qual é o seu nome?");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
            JOptionPane.showMessageDialog(null, "Bem-vindo(a) à Estação Órbita-1, " + nomeAstronauta +
                    ". Idade registrada: " + idade + " anos.");
        }
    }
