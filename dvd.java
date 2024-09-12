package persewaan;
//subclass

public class dvd extends product {
    private int lenght;
    private String rating;
    private String studio;

    public int getLenght() {
        return this.lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public dvd() {
        number = 20;
        name = "dvd selamat siang";
        quantity = 0;
        price = 0.0;
        lenght = 0;
        rating = "anak anak";
        studio = "newline cinema";
    }

    public dvd(int number, String name, int quantity, double price, int lenght, String rating, String studio) {
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.lenght = lenght;
        this.rating = rating;
        this.studio = studio;
    }

    public void print() {
        System.out.println("number : " + number);
        System.out.println("name :" + name);
        System.out.println("quantity :" + quantity);
        System.out.println("price :" + price);
        System.out.println("lenght :" + lenght);
        System.out.println("rating :" + rating);
        System.out.println("studio :" + studio);

    }

}
