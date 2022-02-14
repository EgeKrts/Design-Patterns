public class OfficeComputer extends Computer{
    @Override
    public void plugCPU() {
        System.out.println("Putting low-end dual-core cpu.");
    }

    @Override
    public void plugMemory() {
        System.out.println("Putting energy efficient memory.");
    }

    @Override
    public void plugStorage() {
        System.out.println("Putting energy efficient hdd.");
    }
}
