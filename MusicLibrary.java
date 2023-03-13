import java.util.HashMap;

public class MusicLibrary {
    // Create a new HashMap to store the track titles and lyrics
    private HashMap<String, String> trackList;

    public MusicLibrary() {
        trackList = new HashMap<>();
    }

    public void addTrack(String title, String lyrics) {
        trackList.put(title, lyrics);
    }

    public String printLyrics(String title) {
        return trackList.get(title);
    }

    public void printAllTracks() {
        System.out.println("All tracks:");
        for (String key : trackList.keySet()) {
            System.out.println(key + ":\n" + trackList.get(key));
        }
    }
}