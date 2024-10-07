package tugas_pbo;
import java.util.Scanner;
 class input_output {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nm, kls, hb;
        int nis;


        System.out.print("Masukan Nama : ");
        nm = input.nextLine();
        System.out.print("Masukan Hobi : ");
        hb = input.nextLine();
        System.out.print("Masukan Kelas : ");
        kls = input.nextLine();
        System.out.print("Masukan Nis : ");
        nis = input.nextInt();

        System.out.println("\nBerikut Data Siswa Yang Telah Di isi : ");
        System.out.println("Nama :" + nm);
        System.out.println("Nis : " + nis);
        System.out.println("Hobi : " + hb);
        System.out.println("Kelas : " + kls);
       
    }
    
}
