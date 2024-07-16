import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String email;

    private List <Media> purchaseMediaList;
    private List <Media> shoppingCart;



    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.purchaseMediaList =new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public List<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public List<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPurchaseMediaList(List<Media> purchaseMediaList) {
        this.purchaseMediaList = purchaseMediaList;
    }

    public void setShoppingCart(List<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }



    //Adds media to the user's shopping cart.
    public void AddToCart(Media media) {
        shoppingCart.add(media);
    }
  //Removes media from the shopping cart.
    public void removeFromCart (Media media) {
        shoppingCart.remove(media);
    }
//**
    public void addPurchaseMediaList (Media media){
        purchaseMediaList.add(media);
    }

    //Completes the purchase and updates purchased media list and stock.
    public void checkout(){
        purchaseMediaList.addAll(shoppingCart);
        for(Media media : shoppingCart){
           if(media instanceof Book){
                ((Book)media).purchase(this);
            } }
    }


    public String toString (){
        return " Username: " + getUsername() + " , Email: " + getEmail() ;
    }






}
