package src.en_us.lsp_liskov_substitution_principle.violation.secondexample;

public class Penguin extends Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("I can't fly!");
    }

    @Override
    public void peck() {
        System.out.println("Yes I can peck!");
    }

}
