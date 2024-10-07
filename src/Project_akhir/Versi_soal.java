package Project_akhir;
import java.util.Scanner;

public class Versi_soal {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Tipe Kamar : ");
        System.out.println("1. SIngle");
        System.out.println("2. Double");
        System.out.print("Pilihan anda : ");
        int tipe= input.nextInt();
        
        switch (tipe) {
        case 1 : System.out.println("Single : 175.000/malam");break;
        case 2 : System.out.println("Double : 225.000/malam");break;
        
        default : System.out.println("Gak ada yang kayak gitu");            
    }
        String nama,alamat,palsu;
        int telepon,ktp;
        
        System.out.println("\nTolong Masukkan Data Diri Anda");
        
        palsu=input.nextLine();
        
        System.out.print("Nama : ");
        nama= input.nextLine();

        System.out.print("Alamat : ");
        alamat= input.nextLine();
        
        System.out.print("No.Telepon : ");
        telepon=input.nextInt();
        
        System.out.print("No.KTP : ");
        ktp=input.nextInt();
        
        System.out.println("--------------------");
        System.out.println("Nama \t\t: " + nama);
        System.out.println("Alamat \t\t: " + alamat);
        System.out.println("No.Telepon \t: " + telepon);
        System.out.println("No.KTP \t\t: " + ktp);
        System.out.println("--------------------\n");
        
        System.out.println("Nama Penyewa :" +nama);
        System.out.println("Tipe Kamar :" +tipe);
        System.out.println("Pembayaran");
        System.out.println("1.CASH \n2.DEBIT");
        int payment= input.nextInt();
        if (payment == 1 ){
            System.out.println("CASH");
        }
        else{
            System.out.println("DEBIT");
        }
        
  }
}
