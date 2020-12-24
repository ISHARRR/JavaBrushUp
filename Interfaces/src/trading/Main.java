package trading;

public class Main {
    public static void main(String[] args) {
        ITradingStrategy trade;
        trade = new HarrysTrading();
        System.out.println(trade.createTrade());
        trade.cancelTrade();

    }
}
