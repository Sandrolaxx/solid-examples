package src.pt_br.lsp_principio_substituicao_liskov.violacao.secondexample;

public class Pinguim extends Passaro {

    @Override
    public void voar() {
        throw new UnsupportedOperationException("💩 eu não consigo voar🐧!");
    }

    @Override
    public void bicar() {
        System.out.println("Sim eu consigo bicar😎!");
    }

}
