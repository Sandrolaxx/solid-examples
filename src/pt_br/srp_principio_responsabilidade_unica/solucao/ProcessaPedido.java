package src.pt_br.srp_principio_responsabilidade_unica.solucao;

import src.pt_br.srp_principio_responsabilidade_unica.violacao.Pedido;

/**
 * SRP SOLUÇÃO
 */
public class ProcessaPedido {

    public void processar(Pedido pedido) {
        PostgresRepository pgRepo = new PostgresRepository();
        EnviarEmailConfirmacao enviarEmail = new EnviarEmailConfirmacao();
        
        // Regra de negócio processar pedido
        System.out.println("Regra de negócio ao processar pedido...");
        pedido.setNomeCliente("sandrolaxx");
        pedido.setEmailCliente("sandrolax@gmail.com");
        pedido.setId(47);

        pgRepo.salvar(pedido);

        enviarEmail.enviarEmailConfirmacao(pedido);
    }

}
