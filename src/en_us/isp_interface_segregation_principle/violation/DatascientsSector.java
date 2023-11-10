package src.en_us.isp_interface_segregation_principle.violation;

/**
 * ISP VIOLATION
 */
public class DatascientsSector implements GenerateSalesReport {

    @Override
    public void generateExcel() {
        System.out.println("Yeee, useful method for me!");
    }
    
    @Override
    public void generatePDF() {
        System.out.println("Nooo! Useless method for me, I will never use this.");
    }
    
}
