package mediator.chap2;

// 库存
public class Stock {

    private AbstractMediator mediator;

    public Stock(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    private static int COMPUTER_NUMBER = 100;

    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    public void decrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    public void clearStock() {
        System.out.println("清理存货数量为：" + COMPUTER_NUMBER);
        this.mediator.sale.offSale();
        this.mediator.purchase.refuseBuyIBM();
    }
}
