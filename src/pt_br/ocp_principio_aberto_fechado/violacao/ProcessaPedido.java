package src.pt_br.ocp_principio_aberto_fechado.violacao;

import src.pt_br.srp_principio_responsabilidade_unica.solucao.EnviarEmailConfirmacao;
import src.pt_br.srp_principio_responsabilidade_unica.solucao.PostgresRepository;
import src.pt_br.srp_principio_responsabilidade_unica.violacao.Pedido;

/**
 * OCP VIOLAÇÃO - REQUERIDO MUDANÇAS NO PROCESSO E MUDAMOS DIRETAMENTE NA CLASSE
 */
public class ProcessaPedido {

    public void processar(Pedido pedido) {
        // Antes do processamento
        if (!pedido.possuiItens()) {
            throw new RuntimeException("Não é possível continuar! Pedido sem itens.");
        }
        
        PostgresRepository pgRepo = new PostgresRepository();
        EnviarEmailConfirmacao enviarEmail = new EnviarEmailConfirmacao();
        
        // Regra de negócio processar pedido
        System.out.println("Regra de negócio ao processar pedido...");
        pedido.setNomeCliente("sandrolaxx");
        pedido.setEmailCliente("sandrolax@gmail.com");
        pedido.setId(47);

        pgRepo.salvar(pedido);

        enviarEmail.enviarEmailConfirmacao(pedido);

        // Depois do processamento
        if (!pedido.isValid()) {
            throw new RuntimeException("Não é possível continuar! Pedido sem Id");
        }
    }

}
