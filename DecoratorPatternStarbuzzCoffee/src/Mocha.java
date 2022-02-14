public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +",Mocha";
    }
}
