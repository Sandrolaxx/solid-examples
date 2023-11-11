package src.pt_br.ocp_principio_aberto_fechado.violacao;

/**
 * OCP VIOLAÇÃO - REQUERIDO MUDANÇAS NO PROCESSO E MUDAMOS DIRETAMENTE NA CLASSE
 */
public class ProcessaPedido {

    public void processar(Pedido pedido) {
        // Antes do processamento
        if (!pedido.possuiItens()) {
            throw new RuntimeException("Não é possível continuar! Pedido sem itens.");
        }
        
        //
        // Regra de negócio de processar pedido - Similar aos exemplos de SRP
        //

        // Depois do processamento
        if (!pedido.isValid()) {
            throw new RuntimeException("Não é possível continuar! Pedido sem Id");
        }
    }

}
