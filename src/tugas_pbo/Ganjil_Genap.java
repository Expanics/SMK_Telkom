
package tugas_pbo;
import java.util.Scanner;
public class Ganjil_Genap {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int angka;
        System.out.println("Cara Menetukan Angka Ganjil dan Genap");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Angka = ");
        angka=input.nextInt();
        
        if (angka%2 == 0){
            System.out.println("Angka yang kamu masukkan adalah angka genap");
        }else {
             System.out.println("Angka yang kamu masukkan adalah angka ganjil");
        }
    
  }
}
