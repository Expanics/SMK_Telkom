package Project_akhir;
import java.util.Scanner;

public class Versi_flowchart {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       int single=175000;
       int double1=225000;
       
       System.out.println("Pilih Hotel");
       System.out.println("1. Hotel Aman");
       System.out.println("2. Hotel Murah");
       System.out.print("Hotel : ");
       int hotel= input.nextInt();
       
       switch (hotel){
           case 1 : System.out.println("1. Hotel Aman");break;
           case 2 : System.out.println("2. Hotel Murah");break;
           
           default : System.out.println("Gak Ada Yang Kayak Gitu");
       }
       String palsuu= input.nextLine();
       System.out.print("Tanggal Check in : ");
       String in= input.nextLine();
       System.out.print("Tanggal Check out : ");
       String out= input.nextLine();
       System.out.print("Jumlah Kamar : ");
       int jml= input.nextInt();
       
       System.out.println("Jenis Kamar  ");
       System.out.println("1. SIngle");
       System.out.println("2. Double");
       System.out.print("Pilihan anda : ");
       int jns= input.nextInt();
       
       switch (jns) {
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
        System.out.println("--------------------");
        
       System.out.println("Nama Penyewa :" +nama);
       System.out.println("Jenis Kamar :" +jns);
       
       System.out.print("Total Pembayaran : ");
      int total1=single*jml ;
      int total2=double1*jml;
      
       if (jns == 1){
           System.out.println(total1);
      }
       else if (jns == 2){
           System.out.println(total2);
           
      }
        
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
