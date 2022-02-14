public class GamingComputer extends Computer{
    @Override
    public void plugCPU() {
        System.out.println("Putting high-end multi-core cpu.");
    }

    @Override
    public void plugMemory() {
        System.out.println("Putting high clock speed memory.");
    }

    @Override
    public void plugStorage() {
        System.out.println("Putting ssd storage.");
    }
}
