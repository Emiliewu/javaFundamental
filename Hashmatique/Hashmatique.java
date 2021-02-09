import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
  private HashMap<String, String> tracklist = new HashMap<String, String>();
  public void tracklist(){
    tracklist.put("Song 1", "Lyrics for song 1");
    tracklist.put("Song 2", "Lyrics for song 2");
    tracklist.put("Song 3", "Lyrics for song 3");
    tracklist.put("Song 4", "Lyrics for song 4");
    tracklist.put("Song 5", "Lyrics for song 5");
  }

    public void setTracklist(String song, String lyrics) {
      tracklist.put(song, lyrics);
    }
    public String getSong(String song) {
      String s = tracklist.get(song);
      System.out.println(s);
      return s;
    }
    public void displayAll() {
      Set<String> songs = tracklist.keySet();
      for (String song: songs) {
        System.out.println(song+": " + tracklist.get(song));
      }
    }

  
}