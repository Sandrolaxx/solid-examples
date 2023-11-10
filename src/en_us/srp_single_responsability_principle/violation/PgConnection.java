package src.en_us.srp_single_responsability_principle.violation;

public class PgConnection {

    public PgConnection(String dbUrl) {
        // Simulating create connection in postgres
    }
    
    public void persist(Order order) {
        System.out.println("Persisting order on POSTGRES database...");
        // Persisting data on real db
    }

}
