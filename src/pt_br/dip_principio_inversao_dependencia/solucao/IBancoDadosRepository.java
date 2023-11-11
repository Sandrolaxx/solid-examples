package src.pt_br.dip_principio_inversao_dependencia.solucao;

import src.pt_br.srp_principio_responsabilidade_unica.violacao.Pedido;

/**
 * DIP SOLUÇÃO
 */
public interface IBancoDadosRepository {
    
    boolean salvar(Pedido pedido);

}
