import java.util.Iterator;

public class OfficeCompIterator implements Iterator {
    Computer[] computers;
    int position = 0;

    public OfficeCompIterator(Computer[] computers) {
        super();
        this.computers = computers;
    }

    @Override
    public boolean hasNext() {
        if (position >= computers.length || computers[position] == null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public Computer next() {
        Computer computer =  computers[position];

        position = position + 1;

        return computer;
    }
}
