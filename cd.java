package persewaan; //nama folder tempat penyimpanan

//subclass

public class cd extends product {

    private String artist;
    private int totalsong;
    private String label;

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTotalsong() {
        return this.totalsong;
    }

    public void setTotalsong(int totalsong) {
        this.totalsong = totalsong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public cd() {
        number = 10;
        name = "cd selamat siang";
        quantity = 0;
        price = 0.0;
        artist = "salman";
        totalsong = 0;
        label = "sony music";
    }

    public cd(int number, String name, int quantity, double price, String artist, int totalsong, String label) {
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.artist = artist;
        this.totalsong = totalsong;
        this.label = label;
    }

    public void print() {
        System.out.println("number : " + number);
        System.out.println("name :" + name);
        System.out.println("quantity :" + quantity);
        System.out.println("price :" + price);
        System.out.println("artist :" + artist);
        System.out.println("totalsong :" + totalsong);
        System.out.println("label :" + label);

    }

}
