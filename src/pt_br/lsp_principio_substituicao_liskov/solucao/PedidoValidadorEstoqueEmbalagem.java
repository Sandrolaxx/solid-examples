package src.pt_br.lsp_principio_substituicao_liskov.solucao;

import src.pt_br.lsp_principio_substituicao_liskov.violacao.Item;
import src.pt_br.lsp_principio_substituicao_liskov.violacao.Pedido;
import src.pt_br.lsp_principio_substituicao_liskov.violacao.PedidoValidadorEstoque;

/**
 * LSP SOLUÇÃO
 */
public class PedidoValidadorEstoqueEmbalagem extends PedidoValidadorEstoque {

    @Override
    public boolean isValid(Pedido pedido) {
        for (Item item : pedido.getItens()) {
            if (!item.emEstoque()) {
                return false;
            }

            if (!item.foiEmbalado()) {
                // LOG do erro - Não quebrar o contrato da herança
                return false;
            }
        }

        return true;
    }

}
