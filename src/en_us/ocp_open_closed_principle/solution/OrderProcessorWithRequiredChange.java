package src.en_us.ocp_open_closed_principle.solution;

import src.en_us.ocp_open_closed_principle.violation.Order;
import src.en_us.srp_single_responsability_principle.solution.OrderProcessor;

/**
 * OCP SOLUTION
 */
public class OrderProcessorWithRequiredChange extends OrderProcessor {
    
    public void process(Order order) {
        // Before Processing
        if (!order.hasItems()) {
            throw new RuntimeException("Is not possible continue! Order has no itens");
        }
        
        this.process(order);
        
        // After Processing
        if (!order.isValid()) {
            throw new RuntimeException("Is not possible continue! Order has no Id");
        }
    }

}
