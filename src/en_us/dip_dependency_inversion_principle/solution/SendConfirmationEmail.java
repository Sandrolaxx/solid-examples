package src.en_us.dip_dependency_inversion_principle.solution;

import src.en_us.srp_single_responsability_principle.violation.Order;
import src.en_us.srp_single_responsability_principle.violation.SmtpGmail;

/**
 * DIP SOLUTION
 */
public class SendConfirmationEmail implements IMailRepository {

    public void sendConfirmationEmail(Order order) {
        SmtpGmail smtp = new SmtpGmail("mySmtpUser", "mySmtpPassword");
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();

        String html = "Dear ".concat(name).concat(", yor Order ")
                .concat(order.getId().toString()).concat(" is confirmed!😎");

        smtp.send(html, email);
    }

}
