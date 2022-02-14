package EagerInitialization;

public class Coin {
    private static final int ADD_MORE_COIN = 10;
    private int coin = 0;
    private static Coin instance = new Coin();

    private Coin() {

    }

    public static Coin getInstance() {
        return instance;
    }

    public int getCoinCount() {
        return coin;
    }

    public void addMoreCoin() {
        coin += ADD_MORE_COIN;
    }

    public void deductCoin() {
        coin--;
    }
}
