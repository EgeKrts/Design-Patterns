public class Dj {

    Component songList;

    public Dj(Component songList){
        this.songList = songList;
    }

    public void getSongList(){
        songList.displaySong();

    }
}
