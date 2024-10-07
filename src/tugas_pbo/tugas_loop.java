package tugas_pbo;
import java.util.Scanner;

public class tugas_loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,j,hasil;
        
        System.out.print("masukkan angka : ");
        n = input.nextInt();
        for(j=1; j<=10; j++){
            hasil= n*j;
            System.out.println(n +" x "+ j +" = "+ hasil);
        }
    }
    
}
