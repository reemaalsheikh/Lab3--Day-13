import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Book book = new Book("Atlas of the heart","Brene Brown","123456789",100 , 10);
            Book book1 = new Book("Manifest","Roxie Nafousi","123987654",90 , 10);

        Movie movie = new Movie("Pulp fiction","Quentin Tarantino","55661239",45 , 120);
        Movie movie1 = new Movie("Up","Peter Hans Doctor","123567849",45 , 120);

        Music music = new Music("The City holds my heart","Ghostly","12356789",55,"Ghostly kisses");
        Music music1 = new Music("Ana Negm","Cairokee","123451234",55,"Cairokee");

        Novel novel = new Novel("Jane Eyre" ,"Charlotte Bronte","123456756",49.99 ,4 ,"Drama" );
        Novel novel1 = new Novel("Comedy" ,"Charles","123567812",39.99 ,10 ,"Comedy" );

        AcademicBook academicBook = new AcademicBook("JAVA 1","Herbert Schildt","12345",30 , 50 ,"Programming1");
        AcademicBook academicBook1 = new AcademicBook("Java 2", "Herbert Schildt" , "123456",30 , 20 ,"Programming2");

        Store store = new Store();

        store.addMedia(book);
        store.addMedia(book1);

        store.addMedia(movie);
        store.addMedia(movie1);

        store.addMedia(music);
        store.addMedia(music1);

        store.addMedia(novel);
        store.addMedia(novel1);

        store.addMedia(academicBook);
        store.addMedia(academicBook1);




        User user = new User("Reema","Reema@gmail.com");
        User user1 = new User("Rawan","Rawan@gmail.com");
        store.addUser(user);
        store.addUser(user1);

        System.out.println("Users: ");
        store.displayUsers();
        System.out.println();

        System.out.println("Media: ");
        store.displayMedia();
        System.out.println();

        user.AddToCart(book);
        user.AddToCart(book1);
        user.AddToCart(movie);
        user.AddToCart(movie1);
        user.AddToCart(music);
        user.AddToCart(novel);
        user.AddToCart(novel1);
        user.AddToCart(academicBook);
        user.AddToCart(academicBook1);
        user.removeFromCart(movie1);
        user.checkout();


        user1.AddToCart(book1);
        user1.AddToCart(movie1);
        user1.AddToCart(novel);
        user1.AddToCart(academicBook);
        user1.checkout();




        Review review = new Review("Reema",4.5 , "Great book");
        book.addReview(review);


        Review review1 = new Review("Rawan",5 , "I like it.");
        book1.addReview(review1);
        novel.addReview(review1);


        System.out.println();
        System.out.println("Average rating of "+ book.getTitle()+": " + book.getAverageRating()+" "+book.getMediaType());
        System.out.println("Average rating of "+ book1.getTitle()+": "+ book1.getAverageRating()+" "+book1.getMediaType());

        System.out.println("Average rating of " +novel.getTitle()+": "+ novel.getAverageRating() + " "+novel.getMediaType());
        System.out.println("Average rating of "+novel1.getTitle()+": " + novel1.getAverageRating() + " "+ novel1.getMediaType());


        System.out.println();


        System.out.println("Searching for Book 'Atlas of the heart':");
        Book searchBook = store.searchBook("Atlas of the heart");
        if (searchBook != null) {
            System.out.println("Book Found: ");
            System.out.println(searchBook);

        }else{
            System.out.println("Book not found.");
        }
        System.out.println();

        System.out.println("Books Restock: ");
        book.restock(3);
        novel.restock(2);
        System.out.println();



        System.out.println("Music: ");

        music.listen(user);
        music1.listen(user1);

        System.out.println("\"The City holds my heart\"  "+music.getMediaType());
        System.out.println("Ana Negm  "+ music1.getMediaType());


        System.out.println();
        System.out.println("Movie: ");
        movie.watch(user);
        System.out.println(movie.getTitle()+" "+movie.getDuration()+" min  ," +movie.getMediaType());
        movie1.watch(user1);
        System.out.println(movie1.getTitle()+" "+movie1.getDuration()+" min ," +movie.getMediaType());
        System.out.println();


        System.out.println("Books: ");
        System.out.println(book);
        System.out.println(book1);
        System.out.println();

        System.out.println("Novels: ");
        System.out.println(novel);
        System.out.println(novel1);
        System.out.println();

        System.out.println("Academic books: ");
        System.out.println(academicBook);
        System.out.println(academicBook1);
        System.out.println();

        System.out.println("Music: ");
        System.out.println(music);
        System.out.println(music1);
        System.out.println();

        System.out.println("Movies: ");
        System.out.println(movie);
        System.out.println(movie1);
        System.out.println();












    }
}