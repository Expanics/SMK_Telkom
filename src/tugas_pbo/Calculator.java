
package tugas_pbo;

import java.util.Scanner;

public class Calculator {
     public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int angka1, angka2, proses;
        
        System.out.println("masukkan angka");
        System.out.print("Angka 1 : ");
        angka1=input.nextInt();
        System.out.print("Angka 2 : ");
        angka2=input.nextInt();        
        
        System.out.println("\nPilihan Proses : ");
        System.out.println("1. untuk + ");
        System.out.println("2. untuk - ");
        System.out.println("3. untuk / ");
        System.out.println("4. untuk * \n");
        System.out.println("Ketik proses yang dinginkan : ");
        proses=input.nextInt();
        
        int hasil1=angka1+angka2 ;
        int hasil2=angka1-angka2 ;
        int hasil3=angka1/angka2 ;
        int hasil4=angka1*angka2 ;
        
        switch(proses){
            case 1 : 
                System.out.println("maka " + angka1 + " + " + angka2 + " = " + hasil1);break;
            case 2 : 
                System.out.println("maka " + angka1 + " - " + angka2 + " = " + hasil2);break;
            case 3 : 
                System.out.println("maka " + angka1 + " / " + angka2 + " = " + hasil3);break;
            case 4 : 
                System.out.println("maka " + angka1 + " x " + angka2 + " = " + hasil4);break;
        
        }
    }
    
}
    

