import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class GamingComputerLine implements Creater {
    public ArrayList<Computer> list;

    public GamingComputerLine() {
        list = new ArrayList<Computer>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number of Gaming Computer Orders :");

        int orderNum = scanner.nextInt();

        for(int i=1;i<=orderNum;i++) {
            list.add(new Computer("Gaming Computer-"+i));
        }
    }

    public ArrayList<Computer> getComputers() {
        return list;
    }

    @Override
    public Iterator create() {
        return new GamingCompIterator(list);
    }
}
