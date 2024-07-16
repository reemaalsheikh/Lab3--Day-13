import java.util.ArrayList;
import java.util.List;

public class Movie extends  Media{
    private int duration;

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    //Allows users to watch the movie by adding the movie to the purchased list
    public void watch(User user){
        user.addPurchaseMediaList(this);
    }

    //Recommends similar movies based on the director (auteur).
    public List <Movie> recommendSimilarMovies (List<Movie> movieCatalog){
        List <Movie> similarMovies = new ArrayList<>();
        for(Movie movie: movieCatalog){
            if(movie.getAuteur().equals (this.getAuteur())){
                similarMovies.add(movie);
            }
        }
        return similarMovies;
    }

    @Override
    public String getMediaType() {
        return getDuration() >= 120 ? "Long movie" : "Movie";
    }

    @Override
    public String toString() {
        return super.toString()+ " ,Movie Duration: " + getDuration() +" minutes.";
    }
}
