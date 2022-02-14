public class AliveState implements State{
    HeroContext heroCtxt;

    public AliveState(HeroContext heroCtxt) {
        this.heroCtxt = heroCtxt;
    }
    @Override
    public void attack() {
        System.out.println("\n...Hero is attacking others.");
    }

    @Override
    public void attacked(int damage) {
        System.out.println("\n...Hero is being attacked with damage: " + damage);

        heroCtxt.hp = heroCtxt.hp - damage;

        if (heroCtxt.hp <=0 ) {
            heroCtxt.hp = 0;
            heroCtxt.setState(heroCtxt.getDeadState());
        }
    }

    @Override
    public void silenced() {
        System.out.println("\n...Hero is being silenced.");
        heroCtxt.setState(heroCtxt.getSilencedState());
    }

    @Override
    public void revived(int hp) {
        System.out.println("\n...Hero is already alive, and cannot be revived.");
    }

    @Override
    public void recovered() {
        System.out.println("\n...Hero is already recovered, and cannot be recovered.");
    }

    @Override
    public void disappear() {
        System.out.println("\n...Hero disappears.");
        heroCtxt.setState(heroCtxt.getInvisibleState());
    }

    @Override
    public void appear() {
        System.out.println("\n...Hero is already visible, and cannot appear.");
    }

    public String toString() {
        return "Alive";
    }
}
