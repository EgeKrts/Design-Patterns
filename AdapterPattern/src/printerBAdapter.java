public class printerBAdapter implements printerA{
    printerB printerB;

    public printerBAdapter(printerB printerB) {
        this.printerB = printerB;
    }

    @Override
    public void print() {
        printerB.printArray();
    }
}
