package project_tim;
import java.util.Scanner;

public class joki_bentar {

    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        
        // system.out.println itu buat output
        System.out.print("Masukkan panjang alas : ");
        // nextInt itu funsinya biar komputer bisa detek angka yang dimasukkan
        int a = input.nextInt();
        
        System.out.print("Masukan tinggi segitiga : ");
        int t = input.nextInt();
        
        double hasil = 0.5*a*t; 
        System.out.println("Luas segitiga dengan alas "+a+" dan tinggi "+t+" adalah " + hasil);
        // 0.5*a*t itu proses
        // "a" "t" itu nama variable
        // int itu tipe variable
    }
    
    
}
