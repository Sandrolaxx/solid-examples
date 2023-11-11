package src.pt_br.dip_principio_inversao_dependencia.violacao;

import src.pt_br.srp_principio_responsabilidade_unica.violacao.Pedido;

/**
 * DIP VIOLAÇÃO
 */
public class ProcessaPedido {

    public void processar(Pedido pedido) {
        PostgresRepository pgRepo = new PostgresRepository();
        OracleRepository oracleRepo = new OracleRepository();
        EnviarEmailConfirmacao enviarEmail = new EnviarEmailConfirmacao();
        boolean isOracle = true;

        // Regra de negócio processar pedido
        System.out.println("Regra de negócio ao processar pedido...");
        pedido.setNomeCliente("sandrolaxx");
        pedido.setEmailCliente("sandrolax@gmail.com");
        pedido.setId(47);

        if (isOracle) {
            oracleRepo.salvar(pedido);
        } else {
            pgRepo.salvar(pedido);
        }

        enviarEmail.enviarEmailConfirmacao(pedido);

    }

}
