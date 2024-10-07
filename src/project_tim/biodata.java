package project_tim;
import java.util.Scanner;
public class biodata {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nama,alamat,umur,temlah,tgl;
        
        System.out.println("============================");
        System.out.println("Masukkan Data Anda ");
        
        System.out.print("Nama Lengkap : ");
        nama = input.nextLine();
        
        System.out.print("Alamat Lengkap : ");
        alamat = input.nextLine();
        
        System.out.print("Tempat Lahir : ");
        temlah = input.nextLine();
        
        System.out.print("Tanggal Lahir : ");
        tgl = input.nextLine();
        System.out.println("============================");
        
        System.out.println("============================");
        System.out.println("Hasil  ");
        System.out.println("============================");
        System.out.println("Nama Lengkap : "+ nama );
        System.out.println("Alamat Lengkap : "+ alamat);
        System.out.println("Tempat Lahir : "+ temlah);
        System.out.println("Tanggal Lahhir : "+ tgl);
        System.out.println("============================");
    }
    
}
