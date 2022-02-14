public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return ReggianoCheese();
    }

    @Override


    @Override


    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
