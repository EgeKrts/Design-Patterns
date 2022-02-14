public abstract class Computer {

    public void build(){
        plugCPU();
        plugMemory();
        plugStorage();
        plugPeripherals();
    }

    public abstract void plugCPU();

    public abstract void plugMemory();

    public abstract void plugStorage();

    public void plugPeripherals(){
        System.out.println("Connecting mouse, keyboard, monitor");
    }
}
