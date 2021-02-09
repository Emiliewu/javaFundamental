public class HashmatiqueTest {
  public static void main(String[] args) {
    Hashmatique t = new Hashmatique();
    t.tracklist();
    t.setTracklist("Song new", "new Lyrics");
    t.getSong("Song 3");
    t.displayAll();
  }
}