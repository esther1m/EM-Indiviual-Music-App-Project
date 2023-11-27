public class Song {
    // intialising the class and variable names

    String name;
    String artist;
    String playCount;

    public void Song(String name, String artist, String playCount){
        this.name = name;
        this.artist = artist;
        this.playCount = playCount;
    }

    public void printSong(){
        System.out.println(this.name);
        System.out.println(this.artist);
        System.out.println(this.playCount);
    }
}