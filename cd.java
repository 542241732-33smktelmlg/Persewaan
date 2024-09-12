package persewaan; //nama folder tempat penyimpanan
//subclass

public class cd extends product{
    public static void main(String[] args) {
        
    }
   private String artist;
   private int totalsong;
   private String label;

   public cd(){
    number =10;
    name = "cd selamat siang";
    quantity = 0;
    price = 0.0;
    artist = "salman";
    totalsong = 0;
    label = "sony music";
   }
   


    public void print() {
        System.out.println("number : " + number);
        System.out.println("name :" + name);
        System.out.println("quantity :" + quantity);
        System.out.println("price :"+ price);
        System.out.println("artist :"+ artist);
        System.out.println("totalsong :"+ totalsong);
        System.out.println("label :"+ label);

    

   }


    
}
