package src.pt_br.lsp_principio_substituicao_liskov.violacao;

public class Item {

    private Integer id;

    private Integer quantidade;

    private String descricao;

    private boolean embalado;

    public boolean emEstoque() {
        return quantidade > 0;
    }

    public boolean foiEmbalado() {
        return embalado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEmbalado(boolean embalado) {
        this.embalado = embalado;
    }

}
