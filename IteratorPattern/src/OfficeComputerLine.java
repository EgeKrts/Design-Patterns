import java.util.Iterator;

public class OfficeComputerLine implements Creater {
    static final int MAX = 5;
    int number = 0;
    Computer[] computerArr;

    public OfficeComputerLine() {
        computerArr = new Computer[MAX];

        addItem("Office Computer-1");
        addItem("Office Computer-2");
        addItem("Office Computer-3");
        addItem("Office Computer-4");
        addItem("Office Computer-5");
    }

    public void addItem(String string) {
        Computer computer = new Computer(string);
        if (number >= MAX){
            System.err.println("Full");
        }
        else {
            computerArr[number] = computer;

            number = number + 1;
        }
    }

    public Computer[] getComputers() {
        return computerArr;
    }

    @Override
    public Iterator create() {
        return new OfficeCompIterator(computerArr);
    }
}
