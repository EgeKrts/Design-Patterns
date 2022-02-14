public class bufferPrinter implements printerB{
    String s;

    public bufferPrinter(String s) {
        this.s = s;
    }

    @Override
    public void printArray() {
        System.out.println("Printing...");
        String[] arr = s.split(" ");

        for ( String ss : arr) {
            System.out.println(ss);
        }
    }
}
