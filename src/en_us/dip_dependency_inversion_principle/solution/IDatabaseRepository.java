package src.en_us.dip_dependency_inversion_principle.solution;

import src.en_us.srp_single_responsability_principle.violation.Order;

/**
 * DIP SOLUTION
 */
public interface IDatabaseRepository {
    
    boolean save(Order order);

}
