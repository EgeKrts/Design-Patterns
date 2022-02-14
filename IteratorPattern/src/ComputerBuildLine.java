import java.util.Iterator;

public class ComputerBuildLine {
    public OfficeComputerLine officeComp;
    public GamingComputerLine gamingComp;

    public ComputerBuildLine() {
        officeComp = new OfficeComputerLine();
        gamingComp = new GamingComputerLine();
    }

    public void buildComputer(Iterator<Computer> iterator) {
        Computer computer;

        if (iterator instanceof OfficeCompIterator) {
            System.out.println("Office Computers List:");

            OfficeCompIterator officeIterator = (OfficeCompIterator) iterator;

            while (officeIterator.hasNext()) {
                computer = officeIterator.next();
                System.out.println(computer);
            }
        }
        else if (iterator instanceof GamingCompIterator) {
            System.out.println("Gaming Computers List:");

            GamingCompIterator gamingIterator = (GamingCompIterator) iterator;

            while (gamingIterator.hasNext()) {
                computer =gamingIterator.next();
                System.out.println(computer);
            }
        }
    }

    public void runLine() {
        buildComputer(officeComp.create());
        buildComputer(gamingComp.create());
    }
}
