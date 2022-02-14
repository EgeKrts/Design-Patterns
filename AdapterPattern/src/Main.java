import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text :");
        String text=sc.nextLine();

        System.out.println("Enter printer type :");
        String type = sc.nextLine();

        if(type.equalsIgnoreCase("char") )
        {
           charPrinter charPrinter = new charPrinter(text);
           testPrinterA(charPrinter);
        }
        if(type.equalsIgnoreCase("buffer")){
            bufferPrinter bf = new bufferPrinter(text);
            printerA adapter = new printerBAdapter(bf);
            testPrinterA(adapter);
        }

    }
    static void testPrinterA(printerA printer){
        printer.print();
    }
}
