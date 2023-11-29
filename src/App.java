public class App {
    public static void main(String[] args) throws Exception {

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
        songStore.addSong (ss);
        songStore.addSong (syth);
        songStore.addSong (cgbb);
        songStore.addSong (rush);
        songStore.addSong (plastic);
        songStore.addSong (coverMe);

//printing the arraylist

        songStore.printSongStore();
        

    }
}
