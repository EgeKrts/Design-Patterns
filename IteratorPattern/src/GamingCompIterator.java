import java.util.ArrayList;
import java.util.Iterator;

public class GamingCompIterator implements Iterator {
    int position = 0 ;
    public ArrayList<Computer> list;

    public GamingCompIterator(ArrayList<Computer> list) {
        super();
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (position >= list.size() || list.get(position) == null){
            return false;
        }

        else{
            return true;
        }
    }

    @Override
    public Computer next() {
        Computer computer =  list.get(position);

        position = position + 1;

        return computer;
    }
}
