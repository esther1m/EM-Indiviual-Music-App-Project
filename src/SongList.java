import java.util.ArrayList;

//importing to use ArrayList

public class SongList {
    Song song;
    ArrayList <Song> songStore = new ArrayList <Song>();

//initialised the ArrayList to add songs to, as well as telling the computer that the Song object is needed

//creating a method to add a song to the arraylist

    public void addSong (Song song){
        songStore.add(this.song);
    }

//creating a method to remove a song from the arraylist

    public void removeSong (Song song) {
        songStore.remove(this.song);
    }
}
