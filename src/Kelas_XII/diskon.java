package Kelas_XII;
import java.util.Scanner;

public class diskon {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("-Warmindo 13-");
        System.out.println("Masukkan Harga");
        System.out.println("--------------");
        
        System.out.print("Item 1 : ");
        int item1 = input.nextInt();
        
        System.out.print("Item 2 : ");
        int item2 = input.nextInt();
        
        System.out.print("Item 3 : ");
        int item3 = input.nextInt();
        
        int total = (item1+item2+item3);
        
        System.out.print("Total Harga : "+total+"\n");
        System.out.println("-----------------");
        
        if(total<80000){
        System.out.print("Total belanja anda : "+total+"\n");
        }
        if(total>=80000 && total<120000){
        System.out.print("Anda mendapat diskon 2%"+" : "+ (total - total*2/100)+"\n");
        }
        if(total>120000){
        System.out.print("Anda mendapat diskon 4%"+" : "+ (total - total*2/100)+"\n");
        }
        
    }
    
}
