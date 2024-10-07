package Kelas_XII;
import java.util.Scanner;
public class array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Username : ");
        String username = input.nextLine();
        
        System.out.print("Input Password : ");
        String password = input.nextLine();
        
        String[] user = {"asep", "dono","kasino"};
        String[] pass = {"1234", "5678", "9012"};
        
//        System.out.println(username.equals(user[0]) && password.equals(pass[0]));

        
        // Memeriksa kevalidan login
        boolean islogin = false;
        for (int i = 0; i < user.length; i++) {
            if (username.equals(user[i]) && password.equals(pass[i])) {
                islogin = true;
                break;
            }
        }

        // Menampilkan hasil login
        if (islogin == true) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal. Username atau password tidak valid.");
        }

        // Menutup objek Scanner
        input.close();
    }
}