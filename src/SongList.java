import java.util.ArrayList;
import java.util.Scanner;

//importing to use ArrayList

public class SongList {
    Song song;
    ArrayList <Song> songStore = new ArrayList <Song>();
    ArrayList <Song> songsFound = new ArrayList<Song>();
    Scanner scanner = new Scanner (System.in);
    Song returnValue;

    public SongList () {
        
    }

//initialised the ArrayList to add songs to, as well as telling the computer that the Song object is needed

//creating a method to add a song to the arraylist

    public void addSong (Song song){
        songStore.add(song);
    }

//creating a method to remove a song from the arraylist

    public void removeSong (Song song) {
        songStore.remove(song);
    }

//creating a method to find a song over a given number of plays

    public ArrayList findSong (int numberPlays){
        for (int count = 0; count < songStore.size(); count ++){
            if (songStore.get(count).getPlayCount() >= numberPlays){
                System.out.println("Found a song with " + numberPlays + " plays: " + songStore.get(count).getName() + " by: " + songStore.get(count).getArtist());
                songsFound.add(songStore.get(count));
            }
        }
        return songsFound;
    }

    public Song findSongName (String name){
        boolean checker = false;
        
        for (int count = 0; count < songStore.size(); count ++){
            if (songStore.get(count).getName().equals(name)){
                checker = true;
                System.out.println("Found a song with " + name + " by " + songStore.get(count).getArtist() + " with " + songStore.get(count).getPlayCount() + " plays.");
                returnValue = songStore.get(count);
                
            }
        }
        if (!checker){
        returnValue = null;
        }
        return returnValue;
        
        
    }

    public Song findSongArtist (String artist){
        for (int count = 0; count < songStore.size(); count ++){
            if (songStore.get(count).getArtist() == artist){
                System.out.println("Found a song by " + artist + " called " + songStore.get(count).getName() + " with " + songStore.get(count).getPlayCount() + " plays.");
                return songStore.get(count);
            }
        }
        return null;
    }

//creating a method to print every song stored in the list

    public void printSongStore (){
        for (int count = 0; count < songStore.size(); count++){
            songStore.get(count).printSong();
        }
    }


}
