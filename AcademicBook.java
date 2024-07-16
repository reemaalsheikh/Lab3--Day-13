public class AcademicBook extends Book{
    private String subject;

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, String subject) {
        super(title, auteur, ISBN, price, stock);
        this.subject = subject;
    }


    public String getSubject() {
        return subject;
    }


    public void setSubject (String subject) {
        this.subject = subject;
    }

    @Override
    public String getMediaType() {
        return isBestseller() ? "Bestselling AcademicBook" : " AcademicBook";
    }

    @Override
    public String toString() {
        return super.toString() + " Subject: " + getSubject();
    }
}
