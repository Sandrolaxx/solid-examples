package src.en_us.dip_dependency_inversion_principle.violation;
import src.en_us.srp_single_responsability_principle.violation.Order;

/**
 * DIP VIOLATION
 */
public class OracleRepository {

    public boolean save(Order order) {
        OracleConnection dbConnection = new OracleConnection("database.url");

        try {
            dbConnection.persist(order);
        } catch (Exception e) {
            // log
            return false;
        }

        return true;
    }

}
