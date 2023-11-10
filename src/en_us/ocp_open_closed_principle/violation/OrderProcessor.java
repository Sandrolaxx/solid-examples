package src.en_us.ocp_open_closed_principle.violation;

/**
 * OCP VIOLATION - CLASS CHANGES REQUESTED AND WE CHANGE IT DIRECTLY
 */
public class OrderProcessor {

    public void process(Order order) {
        // Before Processing
        if (!order.hasItems()) {
            throw new RuntimeException("Is not possible continue! Order has no itens");
        }

        //
        // Order processing Business logic - like SRP examples
        //

        // After Processing
        if (!order.isValid()) {
            throw new RuntimeException("Is not possible continue! Order has no Id");
        }
    }

}
