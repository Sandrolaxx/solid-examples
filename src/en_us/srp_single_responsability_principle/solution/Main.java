package src.en_us.srp_single_responsability_principle.solution;

import src.en_us.srp_single_responsability_principle.violation.Order;

public class Main {

    public static void main(String[] args) {
        // Process example
        OrderProcessor processor = new OrderProcessor();
        Order order = new Order();

        processor.process(order);

    }

}
