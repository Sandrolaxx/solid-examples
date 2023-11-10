package src.en_us.lsp_liskov_substitution_principle.solution;

import src.en_us.lsp_liskov_substitution_principle.violation.Item;
import src.en_us.lsp_liskov_substitution_principle.violation.Order;
import src.en_us.lsp_liskov_substitution_principle.violation.OrderStockValidator;

/**
 * LSP SOLUTION
 */
public class OrderStockAndPackValidator extends OrderStockValidator {

    @Override
    public boolean isValid(Order order) {
        for (Item item : order.getItems()) {
            if (!item.isInStock()) {
                return false;
            }

            if (!item.isPacked()) {
                // Record the error - Do not break the inheritance contract
                return false;
            }
        }

        return true;
    }

}
