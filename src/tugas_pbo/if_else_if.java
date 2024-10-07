package tugas_pbo;
import java.util.Scanner;
public class if_else_if {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int tinggi;
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Tinggi Anda = ");
        tinggi=input.nextInt();
        
        if (tinggi > 180){
            System.out.println("Anda Sangat Ideal!!");
        }
        else if (tinggi >= 160 ) {
             System.out.println("Anda Ideal!");
        }
        else{
            System.out.println("anda kuarng ideal");
        }
    
  }
}
