package src.en_us.srp_single_responsability_principle.solution;

import src.en_us.srp_single_responsability_principle.violation.Order;
import src.en_us.srp_single_responsability_principle.violation.SmtpGmail;

/**
 * SRP SOLUTION
 */
public class SendConfirmationEmail {

    public void sendConfirmationEmail(Order order) {
        SmtpGmail smtp = new SmtpGmail("mySmtpUser", "mySmtpPassword");
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();

        String html = "Dear ".concat(name).concat(", yor Order ")
                .concat(order.getId().toString()).concat(" is confirmed!😎");

        smtp.send(html, email);
    }

}
