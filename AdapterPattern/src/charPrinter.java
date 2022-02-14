public class charPrinter implements printerA{
    String s;

    public charPrinter(String s) {
        this.s = s;
    }

    @Override
    public void print() {
        System.out.println("Printing...");
        char[] ch =s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(ch[i]);
        }
    }
}
