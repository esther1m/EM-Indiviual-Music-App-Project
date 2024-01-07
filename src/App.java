import java.util.Scanner;

public class App {
        
public static void main(String[] args) throws Exception {
        //getting a scannner object to use for user input
        Scanner scanner = new Scanner (System.in);
//creating song objects to add to the song list

        Song greedy = new Song("greedy", "Tate McRae", 390809229);
        Song redLights = new Song("Red Lights", "Stray Kids", 105269785);
        Song bitp = new Song("Barefoot In The Park", "James Blake", 302569785);
        Song dealer = new Song("Dealer", "Lana Del Ray", 526875348);
        Song ss = new Song("Summertime Sadness", "Lana Del Ray", 1168578464);
        Song syth = new Song("Say Yes To Heaven", "Lana Del Ray", 287307170);
        Song cgbb = new Song("Can't Go Back Baby", "Troye Sivan", 8638292);
        Song rush = new Song("Rush", "Troye Sivan", 18043369);
        Song plastic = new Song("Alby Plastic", "Ruby", 6101986);
        Song coverMe = new Song("Cover Me", "Stray Kids", 9788608);

//creating an object of the SongList class so that I can call the methods for it

        SongList songStore = new SongList();

//adding all the song objects to the array list

        songStore.addSong (greedy);
        songStore.addSong (redLights);
        songStore.addSong (bitp);
        songStore.addSong(dealer);
        songStore.addSong (ss);
        songStore.addSong (syth);
        songStore.addSong (cgbb);
        songStore.addSong (rush);
        songStore.addSong (plastic);
        songStore.addSong (coverMe);

        //setting the condition for the menu to keep repeating
        boolean userInput = true;

        // while the user has not selected "5", quit, the while loop below will keep iterating

        while (userInput == true) {
                //printing the options for the menu
                System.out.println("What would you like to do?");
                System.out.println("1. Add a new song");
                System.out.println("2. Remove a song");
                System.out.println("3. See all songs stored?");
                System.out.println("4. See how many songs have a certain amount of plays or over?");
                System.out.println("5. Quit");
                //gets the user input
                String answer = scanner.nextLine();
                /* this if statements handles the addition of a song to the array
                 * asks the user for the name, artist and play count
                 * creates a song object with those variables
                 * adds the song to the array
                 * then prints out when it has been added, to let the user have confidence it has been added
                 */
                if (answer.equals("1")) {
                        System.out.println("What's the new song name? ");
                        String newSongName = scanner.nextLine();
                        System.out.println("Who's the artist?");
                        String newArtistName = scanner.nextLine();
                        System.out.println("How many plays has the song got?");
                        int newPlayCount = scanner.nextInt();

                        Song newSong = new Song(newSongName, newArtistName, newPlayCount);
                        songStore.addSong(newSong);

                        System.out.println("Song " + "added.");
                /* this if statement handles the removing of a song from the array
                 * allows the user to remove song by name or artist
                 */
                } else if (answer.equals("2")){
                        System.out.println("Would you like to remove by: ");
                        System.out.println("1. Name");
                        System.out.println("2. Artist");
                        int removeSongAnswer = scanner.nextInt();
                        String removeNewLineCharacter = scanner.nextLine();
                        /*asks user for the name of the song
                         * uses a method from songList to find the Song object by name
                         * Once the Song object is found it is the removed.
                         * there is a checker in the condition for the if statement to make sure that it lets
                         * the user know if the object couldnt be found (checking if its null)
                         */
                        if (removeSongAnswer == 1) {
                                System.out.println("What is the name of the song you're trying to remove? ");
                                String name = scanner.nextLine();
                                Song removeSongName = songStore.findSongName(name);
                                if (removeSongName != null) {
                                        songStore.removeSong(removeSongName);
                                        System.out.println("Song " + name + " removed.");
                                } else {
                                        System.out.println("Song not found.");
                                }
                        /*asks user for the artist of the song
                         * uses a method from songList to find the Song object by name
                         * Once the Song object is found it is the removed.
                         * there is a checker in the condition for the if statement to make sure that it lets
                         * the user know if the object couldnt be found (checking if its null)
                         * as its checking the artist, it allows the user to remove one other song by that artist
                         */
                        } else if (removeSongAnswer == 2) {
                                System.out.println("What is the name of the artist's song you're trying to remove? ");
                                String artist = scanner.nextLine();
                                Song removeSongArtist = songStore.findSongArtist(artist);

                                if (removeSongArtist!= null) {
                                        songStore.removeSong(removeSongArtist);
                                        System.out.println("Song by " + artist + " " + removeSongArtist.getName() + " removed.");
                                        System.out.println("Do you want to remove another song by this artist? ");
                                        String checkSong = scanner.nextLine();
                                        if (checkSong.equals("Y")) {
                                                Song removeSongArtist2 = songStore.findSongArtist(artist);

                                                if (removeSongArtist2!= null) {
                                                        songStore.removeSong(removeSongArtist2);
                                                        System.out.println("Song by " + artist + " " + removeSongArtist.getName() + " removed.");
                                                }
                                        }
                                }
                        } else {
                                System.out.println("Song not found");
                        }
                } else if (answer.equals( "3")){

                        //printing the arraylist

                        songStore.printSongStore();

                } else if (answer.equals("4")){
                        /* asks the user to input a number of plays
                         * uses the method in songList to find every song over and equal to that amount and prints them
                         */
                        System.out.println("How many plays? You can only input up to 999,999,999.");
                        int plays = scanner.nextInt();
                        songStore.findSong(plays);
                } else if (answer.equals( "5")) {
                        //changes the condition so the while loop stops executing
                        userInput = false;
                }
                //adds a bit of a break so that the while loop doesn't immediately repeat
                Thread.sleep(3000);
                
        }

        




        

}
}
