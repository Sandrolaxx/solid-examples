package src.en_us.lsp_liskov_substitution_principle.violation;

public class OrderStockValidator {

    public boolean isValid(Order order) {
        for (Item item : order.getItems()) {
            if (!item.isInStock()) {
                return false;
            }
        }

        return true;
    }

}
