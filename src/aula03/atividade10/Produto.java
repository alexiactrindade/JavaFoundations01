package aula03.atividade10;

public class Produto {
    public static void exibirInformacoes () {
        String nomeProdutoA =  "Botas de Propulsão a Jato";
        double precoProdutoA = 19203.00;
        int quantidadeProdutoA = 2;

        String nomeProdutoB = "Pistola de Plasma T-800";
        double precoProdutoB = 14203.00;
        int quantidadeProdutoB = 3;

        System.out.println(
                "=== PRODUTOS CYBERPUNK ===\n\n" +
                        "Produto A:\n" +
                        "  Nome: " + nomeProdutoA + "\n" +
                        "  Preço: €$ " + String.format("%.2f", precoProdutoA) + "\n" +
                        "  Quantidade: " + quantidadeProdutoA + "\n" +
                        "  Subtotal: €$ " + String.format("%.2f", precoProdutoA * quantidadeProdutoA) + "\n\n" +
                        "Produto B:\n" +
                        "  Nome: " + nomeProdutoB + "\n" +
                        "  Preço: €$ " + String.format("%.2f", precoProdutoB) + "\n" +
                        "  Quantidade: " + quantidadeProdutoB + "\n" +
                        "  Subtotal: €$ " + String.format("%.2f", precoProdutoB * quantidadeProdutoB) + "\n\n" +
                        "=== TOTAL DO PEDIDO ===\n" +
                        "Valor total: €$ " + String.format("%.2f", (precoProdutoA * quantidadeProdutoA) + (precoProdutoB * quantidadeProdutoB)) + "\n"
        );
    }
}
