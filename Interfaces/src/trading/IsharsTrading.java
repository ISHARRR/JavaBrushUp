package trading;

public class IsharsTrading implements ITradingStrategy{

    @Override
    public String createTrade() {
        return "Ishar's top secret trading strategy";
    }

    @Override
    public void cancelTrade() {
        System.out.println("Cancelling... Ishar's top secret trading strategy");
    }
}
