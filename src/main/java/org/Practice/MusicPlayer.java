package org.Practice;

public abstract class MusicPlayer {
    /*
    Task1) Music Player System: Create a class MusicPlayer with
    methods like play(), pause(), stop(), and fields such as currentTrack
    and volume. Implement subclasses for different types of music players,
    like MP3Player, CDPlayer, and StreamingPlayer, each with their unique
    implementations of the play() method (e.g., streaming from the internet,
    playing from a CD).
     */
    private String currentTrack;
    private int volume;
    public MusicPlayer(String currentTrack,int volume){
        this.currentTrack = currentTrack;
        this.volume = volume;
    }
    public void printInfo(){
        System.out.println("Current track -"+currentTrack+"- plays on volume set to - "+volume);
    }
    public abstract void play();
    public void pause(){
        System.out.println("Music player pause the music");
    }
    public void stop(){
        System.out.println("Music player stop the music");
    }
}
class MP3Player extends MusicPlayer{
    public MP3Player(String currentTrack,int volume){
        super(currentTrack,volume);
    }

    @Override
    public void play() {
        System.out.println("MP3 player plays compressed music");
    }
}
class CDPlayer extends MusicPlayer{
    public CDPlayer(String currentTrack,int volume){
        super(currentTrack,volume);
    }
    public void play(){
        System.out.println("CD player plays music from Compact Disk");
    }
}
class StreamingPlayer extends MusicPlayer{
    public StreamingPlayer(String currentTrack,int volume){
        super(currentTrack,volume);
    }
    public void play(){
        System.out.println("Streaming player plays music from internet");
    }
}
class MusicPlayerTester{
    public static void main(String[] args) {
        MusicPlayer mp3 = new MP3Player("Ice, Ice Baby", 12);
        MusicPlayer cd = new CDPlayer("It's my life",25);
        MusicPlayer stream = new StreamingPlayer("Can't touch this",30);
        MusicPlayer [] playerArray = {mp3, cd, stream};
        for (int i = 0; i < playerArray.length; i++) {
            playerArray[i].printInfo();
            playerArray[i].play();
            playerArray[i].stop();
            playerArray[i].pause();
            System.out.println("----------------------");
        }

    }
}