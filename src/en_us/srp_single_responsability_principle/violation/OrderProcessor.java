package src.en_us.srp_single_responsability_principle.violation;

/**
 * SRP VIOLATION
 */
public class OrderProcessor {

    public Order process(Order order) {
        // Order processing Business logic

        boolean isPersisted = save(order);

        if (order.isValid() && isPersisted) {
            sendConfirmationEmail(order);
        }

        return order;
    }

    private boolean save(Order order) {
        PgConnection dbConnection = new PgConnection("database.url");

        try {
            dbConnection.persist(order);
        } catch (Exception e) {
            // log
            return false;
        }

        return true;
    }

    private void sendConfirmationEmail(Order order) {
        SmtpGmail smtp = new SmtpGmail("mySmtpUser", "mySmtpPassword");
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();

        String html = "Dear ".concat(name).concat(", yor Order ")
                .concat(order.getId().toString()).concat(" is confirmed!😎");

        smtp.send(html, email);
    }

}
