
package tugas_pbo;
import java.util.Scanner;

public class Tugas_PBO {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai Anda : ");
        int a = input.nextInt();
        
        int nilai= a;
        
        // syarat minimum untuk lulus adalah 67
        
        if(nilai >= 67 ){
        System.out.println("Anda Lulus!");
        }
        else{
        System.out.println("Anda Gagal!");
        }
    }
    
}
