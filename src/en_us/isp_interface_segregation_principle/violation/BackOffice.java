package src.en_us.isp_interface_segregation_principle.violation;

public class BackOffice implements GenerateSalesReport {

    @Override
    public void generateExcel() {
        System.out.println("Yeee, useful method for me!");
    }
    
    @Override
    public void generatePDF() {
        System.out.println("Yeee, useful method for me!");
    }
    
}
