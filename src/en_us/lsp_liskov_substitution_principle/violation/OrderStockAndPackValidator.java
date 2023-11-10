package src.en_us.lsp_liskov_substitution_principle.violation;

/**
 * LSP VIOLATION - BREAK THE INHERITANCE CONTRACT
 */
public class OrderStockAndPackValidator extends OrderStockValidator {

    @Override
    public boolean isValid(Order order) {
        for (Item item : order.getItems()) {
            if (!item.isInStock()) {
                return false;
            }

            if (!item.isPacked()) {
                throw new RuntimeException("Item isn't packed! Return to distribution center.");
            }
        }

        return true;
    }

}
