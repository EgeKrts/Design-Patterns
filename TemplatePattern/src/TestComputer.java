public class TestComputer {

    public static void main(String[] args) {
        Computer gamingComputer = new GamingComputer();
        Computer officeComputer = new OfficeComputer();

        gamingComputer.build();
        officeComputer.build();

    }
}
