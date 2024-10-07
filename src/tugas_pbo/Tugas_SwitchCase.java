
package tugas_pbo;

import java.util.Scanner;

public class Tugas_SwitchCase {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        //Output awal
        System.out.println("Harga Tiket Pesawat BatikAir sekitar Jawa Barat");
        System.out.println("1. Soekarnohatta - DIY (Yogya) ");
        System.out.println("2. Soekarnohatta - NBIA (Bali) ");
        System.out.println("3. Soekarnohatta - Harun Thohir (Kab. Gresik)  ");
        System.out.println("4. Soekarnohatta - BUIB (banyuwangi) ");
        System.out.println("---------------------------------------------");
        
        //input nomor tiket
        System.out.print("Masukan No Tiket yang di inginkan : ");
        int angka= input.nextInt();
        System.out.println("---------------------------------------------");
        
        //switch case
        switch (angka) {
        case 1 : 
            System.out.println("--Soekarnohatta - DIY (Yogya)--");
            System.out.println("Harga Tiket : Rp.850.000,00");
            break;
        case 2 : 
            System.out.println("--Soekarnohatta - NBIA (Bali)--");
            System.out.println("Harga Tiket : Rp.1.500.000,00");
            break;
        case 3 : 
            System.out.println("--Soekarnohatta - Harun Thohir (Kab. Gresik)--");
            System.out.println("Harga Tiket : Rp.700.000,00");
            break;
        case 4 : 
            System.out.println("--Soekarnohatta - BUIB (banyuwangi)--");
            System.out.println("Harga Tiket : Rp.800.000,00");
            break;
        
        default : System.out.println("Maaf, nomor yang anda masukan tidak terdaftar.");
    }
    
    }
    
}
