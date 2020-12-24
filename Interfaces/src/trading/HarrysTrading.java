package trading;

public class HarrysTrading implements ITradingStrategy{
    @Override
    public String createTrade() {
        return "Harry's top secret trading strategy";
    }

    @Override
    public void cancelTrade() {
        System.out.println("Cancelling... Harry's top secret trading strategy");
    }
}
