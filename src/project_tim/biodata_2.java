package project_tim;
import java.util.Scanner;

public class biodata_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama_depan,nama_belakang,NIS,NISN,tempat_lahir,tanggal_lahir,jk,agama,alamat;
                
//        inpwut biodata  
        
        System.out.println("Masukkan data diri anda");
        
        System.out.print("Nama Depan : ");
        nama_depan = input.nextLine();
        
        System.out.print("Nama Belakang : ");
        nama_belakang = input.nextLine();
        
        System.out.print("NIS : ");
        NIS = input.nextLine();
        
        System.out.print("NISN : ");
        NISN = input.nextLine();
        
        System.out.print("Tempat Lahir : ");
        tempat_lahir = input.nextLine();
        
        System.out.print("Tanggal Lahir : ");
        tanggal_lahir = input.nextLine();
        
        System.out.print("Jenis Kelamin : ");
        jk = input.nextLine();
        
        System.out.print("Agama : ");
        agama = input.nextLine();
        
        System.out.print("Alamat : ");
        alamat = input.nextLine();
        
//        Output Biodata
        
        System.out.println("=============================");
        
        System.out.println("\tBiodata Anda");
        
        System.out.println("=============================");
        
        System.out.println("Nama : "+nama_depan+" "+nama_belakang);
        System.out.println("NIS / NISN : "+NIS+" / "+NISN);
        System.out.println("Tempat / Tgl.lahir : "+tempat_lahir+", "+tanggal_lahir);
        System.out.println("Jenis Kelamin : "+jk);
        System.out.println("Agama : "+agama);
        System.out.println("Alamat : "+alamat);
    }
    
}
