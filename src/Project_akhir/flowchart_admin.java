package Project_akhir;
import java.util.Scanner;

public class flowchart_admin {

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int menu;
        
        System.out.println("Tampilan Menu : ");
        System.out.println("1. Fasilitas Tambahan Hotel ");
        System.out.println("2. Total Transaksi ");
        System.out.println("3. Data Penyewa ");
        System.out.println("4. Data Kamar ");
        System.out.print("Masukkan Angka : ");
        menu= input.nextInt();
        
        switch (menu){
            case 1 :
                System.out.println("Fasilitas Tambahan Hotel : ");
                System.out.println("Extra Bed \t: Rp 70.000");
                System.out.println("Gym \t\t: Rp 50.000");
                System.out.println("Jasa Pijat \t: Rp 60.000");
                System.out.println("Food and Drink");break;
            case 2 :
                System.out.println("Total Transaksi : ");
                System.out.println("Kamar Single \t\t\t: Rp 175.000");
                System.out.println("Jumlah Kamar \t\t\t: 1");
                System.out.println("Layanan Tambahan : Gym \t\t: Rp 50.000");
                System.out.println("Biaya Admin \t\t\t: Rp 5.000");
                System.out.println("Total Pembayaran \t\t: Rp 230.000");break;
            case 3 :
                System.out.println("Data Penyewa : ");
                System.out.println("Nama : Fauzi Amal");
                System.out.println("Alamat : Jl.nenek kita rt07 rw05");
                System.out.println("No.Telepon : 082973264923");
                System.out.println("No.KTP : 2485827959825602");break;
            case 4 :
                System.out.println("Data Kamar : ");
                System.out.println("Kamar single No 14 Lt2 Bagian Kiri");
                System.out.println("Nama Penyewa : Fauzi amal");
                System.out.println("Penyewa : 1 cowok dan 1 cewek");
                System.out.println("Keterangan : Incognito");
                System.out.println("Layanan Tambahan : Gym");
                System.out.println("Chenk in : 02/02/2012");
                System.out.println("Chenk out : 03/02/2012");break;
            
            default : System.out.println("Gak Ada Yang Kayak gitu");
        }
    }
    
}
