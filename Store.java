import java.awt.*;
import java.util.List;
import  java.util.ArrayList;

public class Store {
    private List <User> userList;
    private List <Media> mediaList;

    public Store() {
        this.userList = new ArrayList <>();
        this.mediaList = new ArrayList <>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public List<Media> getMediaList() {
        return mediaList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void setMediaList(List<Media> mediaList) {
        this.mediaList = mediaList;
    }



    //Adds a user to the list of users.
    public void addUser(User user) {
        this.userList.add(user);
    }

    //Displays a list of registered users.
   public void displayUsers(){
        for (User user : userList) {
            System.out.println(user);
            System.out.println();
        }
}

    //Adds a media to the list of medias
    public void addMedia(Media media) {
        this.mediaList.add(media);
    }

    //Displays a list of Available medias.
    public void displayMedia(){
        for (Media media : mediaList) {
            System.out.println(media);
            System.out.println();
        }
    }

    //searchBook(String title): Searches for a book by title and returns it if found.

    public Book searchBook (String title) {
        for (Media media : mediaList) {
            if (media instanceof Book && media.getTitle().equalsIgnoreCase(title)) {
               return (Book) media;
            }
        }
        return null;
    }


}
