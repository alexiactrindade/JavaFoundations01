import javax.swing.JOptionPane;

public class Atividade03 {
    public static void controleHangar() {
        String input = JOptionPane.showInputDialog("Digite o ID do visitante:");
        int id = Integer.parseInt(input);

        boolean isPar = (id % 2 == 0);
        boolean isMultiploDe5 = (id % 5 == 0);

        String portao = (isPar) ? "A" : "B";
        String statusVip = (isMultiploDe5) ? "Selo VIP" : "Sem selo VIP";

        if (isPar && isMultiploDe5) {
            System.out.println("INFO: Visitante especial com acesso prioritário ao Portão A + VIP");
        }

        if (!isPar || isMultiploDe5) {
            System.out.println("INFO: Visitante pode ter benefícios adicionais");
        }

        if ((isPar && !isMultiploDe5) || (!isPar && isMultiploDe5)) {
            System.out.println("INFO: Visitante possui apenas um dos benefícios");
        }

        String mensagem = "ID informado: " + id +
                "\nPortão de acesso: " + portao +
                "\n" + statusVip +
                "\n\nStatus consolidado: " +
                ((!isPar && !isMultiploDe5) ? "Visitante regular (sem benefícios)" : "Visitante com pelo menos um benefício");

        JOptionPane.showMessageDialog(null, mensagem);
    }
}