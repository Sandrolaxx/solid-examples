package src.pt_br.lsp_principio_substituicao_liskov.violacao.secondexample;

public class BemTeVi extends Passaro {

    @Override
    public void bicar() {
        System.out.println("Sim eu consigo bicar😎!");
    }

    @Override
    public void voar() {
        System.out.println("Sim eu consigo voar🕊!");
    }

}
