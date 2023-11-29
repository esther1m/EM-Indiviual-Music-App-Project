import java.util.ArrayList;

//importing to use ArrayList

public class SongList {
    Song song;
    ArrayList <Song> songStore = new ArrayList <Song>();

    public SongList () {
        //this.song = song;
        
    }

//initialised the ArrayList to add songs to, as well as telling the computer that the Song object is needed

//creating a method to add a song to the arraylist

    public void addSong (Song song){
        songStore.add(song);
    }

//creating a method to remove a song from the arraylist

    public void removeSong (Song song) {
        songStore.remove(this.song);
    }

//creating a method to find a song over a given number of plays

    public void findSong (int numberPlays){
        for (int count = 0; count < songStore.size(); count ++){
            if (songStore.get(count).getPlayCount() == numberPlays){
                System.out.println("Found a song with " + numberPlays + " : " + songStore.get(count).getName() + " by: " + songStore.get(count).getArtist());
            }
        }
    }

//creating a method to print every song stored in the list

    public void printSongStore (){
        for (int count = 0; count < songStore.size(); count++){
            songStore.get(count).printSong();
        }
    }
}
