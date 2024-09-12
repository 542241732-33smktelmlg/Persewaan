package persewaan;
//subclass

public class dvd extends product{
   private int lenght;
   private String rating;
   private String studio;

   public dvd(){
    number = 20;
    name = "dvd selamat siang";
    quantity = 0;
    price = 0.0;
    lenght = 0;
    rating = "anak anak";
    studio = "newline cinema";
   }

    public void print(){
        System.out.println("number : " + number);
        System.out.println("name :" + name);
        System.out.println("quantity :" + quantity);
        System.out.println("price :"+ price);
        System.out.println("lenght :"+ lenght);
        System.out.println("rating :"+ rating);
        System.out.println("studio :"+ studio);

    }





   }
    

