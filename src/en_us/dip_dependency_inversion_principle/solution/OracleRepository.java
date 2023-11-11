package src.en_us.dip_dependency_inversion_principle.solution;
import src.en_us.dip_dependency_inversion_principle.violation.OracleConnection;
import src.en_us.srp_single_responsability_principle.violation.Order;

/**
 * DIP SOLUTION
 */
public class OracleRepository implements IDatabaseRepository {

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
