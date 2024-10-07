package tugas_pbo;
import java.util.Scanner;
public class rumus_segitiga {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a,t ;
        double hasil;
        
        System.out.print("Masukkan Alas : ");
        a = input.nextInt();
        System.out.print("Masukkan Tinggi: ");
        t = input.nextInt();
        
        hasil = 0.5*a*t;
        
        System.out.println("Rumus segitiga 1/2 x alas x tinggi");
        System.out.println("Alas : "+a);
        System.out.println("Tinggi : "+t);
        System.out.println("Luas Segitiga : "+hasil);
    }
    
}
