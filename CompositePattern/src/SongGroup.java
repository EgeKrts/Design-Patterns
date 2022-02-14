import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends Component {


    ArrayList songComp = new ArrayList();

    String groupName;
    String groupDesc;

    public SongGroup(String groupName, String groupDesc){
        this.groupName = groupName;
        this.groupDesc = groupDesc;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void add(Component component) {
        songComp.add(component);
    }

    public void remove(Component component) {
        songComp.remove(component);
    }

    public Component getComponent(int index) {
        return (Component) songComp.get(index);
    }

    public void displaySong(){

        System.out.println(getGroupName() + " " + getGroupDesc() + "\n");

       Iterator iterator = songComp.iterator();

        while(iterator.hasNext()) {
            Component songInfo = (Component) iterator.next();
            songInfo.displaySong();
        }
    }
}
