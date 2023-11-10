package src.en_us.srp_single_responsability_principle.violation;

public class SmtpGmail {
    
    public SmtpGmail(String user, String password) {
        // Configure and conection in smtp
    }

    public void send(String html, String mail) {
        System.out.println("Sending confirmation email: ".concat(html));
        // Send e-mail📧
    }

}
