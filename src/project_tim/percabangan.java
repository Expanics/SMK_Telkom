package project_tim;
import java.util.Scanner;

public class percabangan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai : ");
        
        int nilai = scanner.nextInt();
        if(nilai>76){
            System.out.println("lulus");
        } else {
            System.out.println("gagal");
        }
    }
    
}
