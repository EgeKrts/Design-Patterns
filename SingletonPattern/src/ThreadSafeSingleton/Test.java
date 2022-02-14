package ThreadSafeSingleton;

public class Test {
    public static void main(String[] args) {
        Coin coin1 = Coin.getInstance();
        Coin coin2 = Coin.getInstance();

        coin1.addMoreCoin();
        System.out.println("coin1.getCoinCount() = " + coin1.getCoinCount());
        System.out.println("coin2.getCoinCount() = " + coin2.getCoinCount());

        coin1.deductCoin();
        System.out.println("coin1.getCoinCount() = " + coin1.getCoinCount());
        System.out.println("coin2.getCoinCount() = " + coin2.getCoinCount());

        System.out.println("coin1 = " + coin1.getInstance());
        System.out.println("coin2 = " + coin2.getInstance());
    }
}
