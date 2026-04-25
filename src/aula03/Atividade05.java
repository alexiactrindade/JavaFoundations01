package aula03;

import javax.swing.JOptionPane;

        public class Atividade05 {
            public static void quantiaChuva() {
                String input = JOptionPane.showInputDialog("Digite a quantidade de chuva (mm em 24h):");
                double quantidadeChuva = Double.parseDouble(input);
                String alerta;

                if (quantidadeChuva <= 10) {
                    alerta = "Sem alerta";
                } else if (quantidadeChuva <= 30) {
                    alerta = "Atenção";
                } else if (quantidadeChuva <= 60) {
                    alerta = "Alerta";
                } else {
                    alerta = "Emergência";
                }

                JOptionPane.showMessageDialog(null,
                        "Quantidade de chuva: " + quantidadeChuva + " mm em 24h\n" +
                                "Alerta: " + alerta);
            }
        }

