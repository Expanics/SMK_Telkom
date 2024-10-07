package tugas_pbo;
import java.util.Scanner;

public class Tugas_time {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n;
        
        System.out.print("Masukkan Angka : ");
        n= input.nextInt();
        
        if(n%2==1){ //sistem ganjil
            System.out.println("weird");
        } 
        if(n >= 2 && n <= 5){
            System.out.println("Not Weird");
        }
        else if(n >= 6 && n <= 20){
            System.out.println("Weird");
        }
        else if(n > 20){
            System.out.println("Not Weird");
        }
    }
    
}
