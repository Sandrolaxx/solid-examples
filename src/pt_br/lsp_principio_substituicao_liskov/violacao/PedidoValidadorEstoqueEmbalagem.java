package src.pt_br.lsp_principio_substituicao_liskov.violacao;

/**
 * LSP VIOLAÇÃO - QUEBRA O CONTRATO DA HERANÇA
 */
public class PedidoValidadorEstoqueEmbalagem extends PedidoValidadorEstoque {

    @Override
    public boolean isValid(Pedido pedido) {
        for (Item item : pedido.getItens()) {
            if (!item.emEstoque()) {
                return false;
            }

            if (!item.foiEmbalado()) {
                throw new RuntimeException("Item não foi embalado! Retorne ao CD(Centro de Distribuição).");
            }
        }

        return true;
    }

}
