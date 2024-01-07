public class Song {
    // intialising the class and variable names

    String name;
    String artist;
    int playCount;

//creating the constructor for the Song class - taking in name, artist, playCount to create an object of the Song class and also ensuring that I can refer to the variables of that object in future

    public Song(String name, String artist, int playCount){
        this.name = name;
        this.artist = artist;
        this.playCount = playCount;
    }

// making a getter method to return the name of the current object of Song class so that it can be called if needed in future

    public String getName(){
        return this.name;
    }

// making a getter method to return the artist

    public String getArtist(){
        return this.artist;
    }

//making a getter method to return the playCount

    public int getPlayCount (){
        return this.playCount;
    }

//making a print method for song so that I don't have to have repetitive lines

    public void printSong(){
        System.out.println("Name: " + this.name);
        System.out.println("Artist: " + this.artist);
        System.out.println("Play count: " + this.playCount);
    }
}