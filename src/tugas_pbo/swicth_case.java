package tugas_pbo;
import java.util.Scanner;

public class swicth_case {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.print("Masukan angka 1 - 3 : ");
        int bil= input.nextInt();
        
        switch (bil) {
        case 1 : System.out.println("Satu");break;
        case 2 : System.out.println("Dua");break;
        case 3 : System.out.println("Tiga");break;
        
        default : System.out.println("Gak ada yang kayak gitu");
    }
    
  }
}
