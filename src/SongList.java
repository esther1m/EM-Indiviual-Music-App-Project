import java.util.ArrayList;
import java.util.Scanner;

//importing to use ArrayList and user input functionalities

/*initialising variables so they can be used later throughout the program regardless of methods
* creating a scanner to have the user input functionalities
* returnValue helps to get the right return value when looking for a song, handling null and a song being found
* logic
*/
public class SongList {
    Song song;
    ArrayList <Song> songStore = new ArrayList <Song>();
    ArrayList <Song> songsFound = new ArrayList<Song>();
    Scanner scanner = new Scanner (System.in);
    Song returnValue;

    public SongList () {
    }

//creating a method to add a song to the arraylist

    public void addSong (Song song){
        songStore.add(song);
    }

//creating a method to remove a song from the arraylist

    public void removeSong (Song song) {
        songStore.remove(song);
    }

/*creating a method to find a song over a given number of plays
* it iterates through every item in the array and checks it with the number of plays given by the user
* prints every song found
* also adds them to an array to make sure all the songs are output that are over the variable given
* that array is then returned
*/

    public ArrayList findSong (int numberPlays){
        for (int count = 0; count < songStore.size(); count ++){
            if (songStore.get(count).getPlayCount() >= numberPlays){
                System.out.println("Found a song with at least " + numberPlays + " plays: " + songStore.get(count).getName() + " by: " + songStore.get(count).getArtist());
                songsFound.add(songStore.get(count));
            }
        }
        return songsFound;
    }

    /* this methods finds a song by its name
     * uses a boolean checker in order to trigger the return value to be null when the song is not found
     * will print the song name, artist and play count when found
     * returnValue is used so that one singular return statement is used and the logic is not messed up
     */
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
    /* this method finds a song by its artist
     * uses a boolean check in order to trigger the return value to be null when the song is not found
     * will print the song name, artist and play count when found
     * returnValue is used so that one singular return statement is used and the logic is not messed up
     */
    public Song findSongArtist (String artist){
        boolean check = false;
        for (int count = 0; count < songStore.size(); count ++){
            if (songStore.get(count).getArtist().equals(artist)){
                check = true;
                System.out.println("Found a song by " + artist + " called " + songStore.get(count).getName() + " with " + songStore.get(count).getPlayCount() + " plays.");
                returnValue = songStore.get(count);
            }
        }
        if (!check){
        returnValue = null;
        }
        return returnValue;
    }

//creating a method to print every song stored in the list

    public void printSongStore (){
        for (int count = 0; count < songStore.size(); count++){
            songStore.get(count).printSong();
        }
    }

}