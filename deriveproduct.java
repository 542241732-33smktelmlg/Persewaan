package persewaan;
import java.util.Scanner;

public class deriveproduct {
    public static void main(String[] args) {
       String choice;
       cd cd = new cd();
       dvd dvd = new dvd();
       Scanner s = new Scanner(System.in);
       System.out.print("cd/dvd: ");
       choice = s.nextLine();

       if (choice.equalsIgnoreCase("cd")) {
         cd.print();
       }else if (choice.equalsIgnoreCase("dvd")) {
        dvd.print();
       }
        s.close();                                                                                                                                                                                                                                                                                                                                                                                                                                                  
       }
    }
    

