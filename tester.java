package persewaan;

import java.util.Scanner;

public class tester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("mau membuat berapa objek");
        int jumlah = in.nextInt();
        try{

        }catch (Exception e) {
            System.out.println("tipe data salah.");
        }

        System.out.println("pilih cd atau dvd");
        String pilihan = in.next();


        if(pilihan.equals("cd")){
            cd c = new cd();
            c.print();
        }else if (pilihan.equals("dvd")){
            dvd c = new dvd();
            c.print();
        }else {
            System.out.println("input salah. ");
        }
    }
    
}
