package src.en_us.lsp_liskov_substitution_principle.violation;

public class Item {

    private Integer id;

    private Integer quantity;

    private String description;

    private boolean packed;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPacked(boolean packed) {
        this.packed = packed;
    }

    public boolean isInStock() {
        return quantity > 0;
    }

    public boolean isPacked() {
        return packed;
    }

}
