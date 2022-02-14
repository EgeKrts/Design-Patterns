public class SilencedState implements State {
    HeroContext heroCtxt;

    public SilencedState(HeroContext heroCtxt) {
        this.heroCtxt = heroCtxt;
    }

    @Override
    public void attack() {
        System.out.println("\n...Hero is silenced and cannot attack others.");
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
        System.out.println("\n...Hero is already silenced and cannot be silenced again.");
    }

    @Override
    public void revived(int hp) {
        System.out.println("\n...Hero is already alive but silenced, and cannot be revived.");
    }

    @Override
    public void recovered() {
        System.out.println("\n...Hero is being recovered.");
        heroCtxt.setState(heroCtxt.getAliveState());
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
        return "Silenced";
    }
}
