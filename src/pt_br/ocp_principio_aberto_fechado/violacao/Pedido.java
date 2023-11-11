package src.pt_br.ocp_principio_aberto_fechado.violacao;

import java.util.List;

public class Pedido {

    private Integer id;

    private String descricao;

    private String nomeCliente;

    private String emailCliente;

    private List<String> itens;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public List<String> getItens() {
        return itens;
    }

    public void setItens(List<String> itens) {
        this.itens = itens;
    }

    public boolean isValid() {
        return id != null;
    }

    public boolean possuiItens() {
        return itens != null && !itens.isEmpty();
    }

}
