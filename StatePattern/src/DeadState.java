public class DeadState implements State {
    HeroContext heroCtxt;

    public DeadState(HeroContext heroCtxt) {
        this.heroCtxt = heroCtxt;
    }

    @Override
    public void attack() {
        System.out.println("\n...Hero is dead, and cannot attack others.");
    }

    @Override
    public void attacked(int damage) {
        System.out.println("\n...Hero is dead, and cannot be attacked.");
    }

    @Override
    public void silenced() {
        System.out.println("\n...Hero is dead, and cannot be silenced.");
    }

    @Override
    public void revived(int hp) {
        System.out.println("\n...Hero is being revived.");
        heroCtxt.hp = hp;
        heroCtxt.setState(heroCtxt.getAliveState());
    }

    @Override
    public void recovered() {
        System.out.println("\n...Hero is dead, and cannot be recovered.");
    }

    @Override
    public void disappear() {
        System.out.println("\n...Hero is dead, and cannot disappear.");
    }

    @Override
    public void appear() {
        System.out.println("\n...Hero is dead, and cannot appear.");
    }

    public String toString() {
        return "Dead";
    }
}
