import java.util.HashMap;

public class TestMusic {
    public static void main(String[] args) {
        // Add some sample songs to the HashMap
        MusicLibrary song = new MusicLibrary();
        song.addTrack("Song 1", "Verse 1\nChorus\nVerse 2\nChorus");
        song.addTrack("Song 2", "Verse 1\nPre-Chorus\nChorus\nVerse 2\nChorus");
        song.addTrack("Song 3", "Verse 1\nChorus\nBridge\nChorus");
        song.addTrack("Song 4", "Verse 1\nPre-Chorus\nChorus\nBridge\nChorus");

        // Print out the lyrics for a specific song
        String songName = "Song 2";
        String lyrics = song.printLyrics(songName);
        System.out.println("Lyrics for " + songName + ":\n" + lyrics);

        // Print out all the songs & their lyrics
        song.printAllTracks();
        }
}
