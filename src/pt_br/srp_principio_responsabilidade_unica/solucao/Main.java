package src.pt_br.srp_principio_responsabilidade_unica.solucao;

import src.pt_br.srp_principio_responsabilidade_unica.violacao.Pedido;

public class Main {

    public static void main(String[] args) {
        // Exemplo processar
        ProcessaPedido processor = new ProcessaPedido();
        Pedido pedido = new Pedido();

        processor.processar(pedido);

    }

}
