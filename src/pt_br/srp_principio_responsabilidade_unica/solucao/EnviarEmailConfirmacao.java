package src.pt_br.srp_principio_responsabilidade_unica.solucao;

import src.pt_br.srp_principio_responsabilidade_unica.violacao.Pedido;
import src.pt_br.srp_principio_responsabilidade_unica.violacao.SmtpGmail;

/**
 * SRP SOLUÇÃO
 */
public class EnviarEmailConfirmacao {

    public void enviarEmailConfirmacao(Pedido pedido) {
        SmtpGmail smtp = new SmtpGmail("usuarioSmtp", "senhaSmtp");
        String nome = pedido.getNomeCliente();
        String email = pedido.getEmailCliente();

        String html = "Caro cliente ".concat(nome).concat(", seu Pedido ")
                .concat(pedido.getId().toString()).concat(" foi confirmado!😎");

        smtp.enviar(html, email);
    }

}
