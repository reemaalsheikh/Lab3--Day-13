import java.util.ArrayList;
import java.util.List;

public class Music extends Media{
    private String artist;

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void listen (User user){
        user.addPurchaseMediaList(this);
    }

    public List <Media> generatePlaylist (List<Music> musicCatalog){
        List <Media> playlist = new ArrayList <>();
        for (Music music: musicCatalog){
            if (music.getArtist().equalsIgnoreCase(this.artist)){
                playlist.add(music);
            }
        }
        return playlist;
    }

    @Override
    public String getMediaType() {
        return getPrice() >= 10 ? "Premium Music" : "Music";
    }

    @Override
    public String toString() {
        return super.toString() + " Artist: " + getArtist();
    }
}
