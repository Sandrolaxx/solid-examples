package src.pt_br.isp_principio_segregacao_interface.solucao;

/**
 * ISP SOLUÇÃO
 */
public class BackOffice implements IGerarRelatorioVendasPDF, IGerarRelatorioVendasExcel {

    @Override
    public void gerarExcel() {
        System.out.println("Show! Super útil para mim.");
    }

    @Override
    public void gerarPDF() {
        System.out.println("Show! Super útil para mim.");
    }

}
