package tugas_pbo;
import java.util.Scanner;

public class Prak_501 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int jumbil, total=0;
        float rata2;
        System.out.print("Berapa banyak bilangannya ? ");
        jumbil= input.nextInt ();
        int data[] = new int[jumbil];
        for(int i=0; i<jumbil; i++){
            System.out.print("Masukkan data ke-" +(i+1)+ ": ");
            data[i] = input.nextInt();
            total = total + data[i];
        }
        System.out.print("Nilai dari rata-rata dari : ");
        for(int i=0; i<(jumbil-1); i++)
            System.out.print(data[i] + "+");
        System.out.print(data[jumbil-1]+ " adalah ");
        rata2= total/jumbil;
        System.out.println(rata2);
    }
}