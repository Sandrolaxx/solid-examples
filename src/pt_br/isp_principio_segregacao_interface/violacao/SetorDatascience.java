package src.pt_br.isp_principio_segregacao_interface.violacao;

/**
 * ISP VIOLAÇÃO
 */
public class SetorDatascience implements IGerarRelatorioVendas {

    @Override
    public void gerarExcel() {
        System.out.println("Show! Super útil para mim.");
    }
    
    @Override
    public void gerarPDF() {
        System.out.println("Não, isso é muito inútil, nunca vou usar!");
    }
    
}
