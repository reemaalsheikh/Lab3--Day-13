import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private int stock;
    private List<Review> reviews;

    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = new ArrayList<>();
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Review> getReviews() {
        return reviews;
    }
    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }


    // Adds a review to the book's list.
    public void addReview(Review review) {
         reviews.add(review);
    }

    //Calculates and returns the average rating.
    public double getAverageRating() {
        double total = 0;
        if(reviews.isEmpty()) {
            return 0;
        }
        for (Review review : reviews) {
            total += review.getRating();
        }
        return total / reviews.size();
    }

    //Allows users to add the book to the purchased list and decrease book stock by 1
     public void purchase (User user) {
        if(stock > 0){
            user.addPurchaseMediaList(this);
            stock--;
        }else {
            System.out.println(" Out of stock");
        }
}

     //This method checks if a book is a bestseller based on
    // criteria such as if its average rating more than or equal 4.5.
     public boolean isBestseller (){
        return getAverageRating() >= 4.5;
      }

    //This method allows for restocking a book by
    //increasing its quantity in stock.
   // It also prints a message to inform about the restocking.
    public void restock (int quantity){
        stock += quantity;
        System.out.println("Restocked:" + quantity +" Total stock:" + stock);
    }

    @Override
    public String getMediaType() {
        return isBestseller() ? "Bestselling book" : "Book";
    }

    @Override
    public String toString() {
        return super.toString() +" Quantity in stock: "+ getStock() + "  , Average rating: " + getAverageRating();
    }
}




