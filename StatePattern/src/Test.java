public class Test {
    public static void main(String[] args) {

        HeroContext heroCtxt = new HeroContext(10);
        System.out.println(heroCtxt);

        heroCtxt.attacked(5);
        System.out.println(heroCtxt);

        heroCtxt.attack();
        System.out.println(heroCtxt);

        heroCtxt.appear();
        heroCtxt.recovered();
        heroCtxt.revived(10);

        heroCtxt.disappear();
        System.out.println(heroCtxt);

        heroCtxt.disappear();
        heroCtxt.attacked(10);
        heroCtxt.silenced();
        heroCtxt.recovered();
        heroCtxt.revived(10);

        heroCtxt.attack();
        System.out.println(heroCtxt);
        heroCtxt.appear();
        System.out.println(heroCtxt);

        heroCtxt.attacked(10);
        System.out.println(heroCtxt);

        heroCtxt.appear();
        heroCtxt.disappear();
        heroCtxt.attack();
        heroCtxt.attacked(5);
        heroCtxt.recovered();
        heroCtxt.silenced();

        heroCtxt.revived(10);
        System.out.println(heroCtxt);

        heroCtxt.silenced();
        System.out.println(heroCtxt);

        heroCtxt.appear();
        heroCtxt.attack();
        heroCtxt.silenced();
        heroCtxt.revived(10);

        heroCtxt.disappear();
        System.out.println(heroCtxt);

        heroCtxt.appear();
        heroCtxt.attacked(5);
        System.out.println(heroCtxt);

        heroCtxt.recovered();
        System.out.println(heroCtxt);

        heroCtxt.silenced();
        heroCtxt.attacked(10);
        System.out.println(heroCtxt);

        heroCtxt.revived(10);
        System.out.println(heroCtxt);
    }

}

