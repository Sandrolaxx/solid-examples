package src.en_us.dip_dependency_inversion_principle.violation;

import src.en_us.srp_single_responsability_principle.violation.Order;

/**
 * DIP VIOLATION
 */
public class OrderProcessor {

    public void process(Order order) {
        PgRepository pgRepo = new PgRepository();
        OracleRepository oracleRepository = new OracleRepository();
        SendConfirmationEmail sendMail = new SendConfirmationEmail();
        boolean isOracle = false;

        // Order processing Business logic
        System.out.println("Executing business rules and logic...");
        order.setCustomerName("sandrolaxx");
        order.setCustomerEmail("sandrolax@gmail.com");
        order.setId(47);

        if (isOracle) {
            oracleRepository.save(order);
        } else {
            pgRepo.save(order);
        }


        sendMail.sendConfirmationEmail(order);
    }

}
