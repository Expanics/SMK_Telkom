package Kelas_XII;
import java.util.Scanner;
public class NewMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        String user2, user3;
        int pass1, pass2, pass3;
        
        System.out.print("masukkan Username : ");
        String user=input.nextLine();
        System.out.print("masukkan Password : ");
        int pass=input.nextInt();
        
        String user1 = "asep";
        user2 = "dono";
        user3 = "bambang";
                
        pass1 = 1234;
        pass2 = 4567;
        pass3 = 890;
        
        if (user.equals(user1)&&pass == pass1 || user.equals(user2)&&pass == pass2 || user.equals(user3)&&pass == pass3){
            System.out.println("anda berhasil login akun "+user);
        }
        else {
            System.out.println("Password atau Username anda tidak sesuai");
        }
    }
    
}
