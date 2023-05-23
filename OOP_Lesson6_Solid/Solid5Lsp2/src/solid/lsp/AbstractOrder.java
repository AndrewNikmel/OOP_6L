package solid.lsp;

public abstract class AbstractOrder {

    protected int price;
    protected int qnt;

    public AbstractOrder(int price, int qnt) {
        this.qnt = qnt;
        this.price = price;
    }


    public abstract int getAmount();
}
