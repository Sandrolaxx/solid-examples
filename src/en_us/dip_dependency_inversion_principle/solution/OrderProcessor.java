package src.en_us.dip_dependency_inversion_principle.solution;

import src.en_us.srp_single_responsability_principle.violation.Order;

/**
 * DIP SOLUTION
 */
public class OrderProcessor {

    private IDatabaseRepository dbRepo;

    private IMailRepository mailRepo;

    public OrderProcessor(IDatabaseRepository dbRepo, IMailRepository mailRepo) {
        this.dbRepo = dbRepo;
        this.mailRepo = mailRepo;
    }

    public void process(Order order) {
        // Order processing Business logic
        System.out.println("Executing business rules and logic...");
        order.setCustomerName("sandrolaxx");
        order.setCustomerEmail("sandrolax@gmail.com");
        order.setId(47);

        dbRepo.save(order);

        mailRepo.sendConfirmationEmail(order);
    }

}
