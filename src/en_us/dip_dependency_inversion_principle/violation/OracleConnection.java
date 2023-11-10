package src.en_us.dip_dependency_inversion_principle.violation;

import src.en_us.srp_single_responsability_principle.violation.Order;

public class OracleConnection {

    public OracleConnection(String dbUrl) {
        // Simulating create connection in oracle
    }
    
    public void persist(Order order) {
        System.out.println("Persisting order on ORACLE database...");
        // Persisting data on real db
    }

}
