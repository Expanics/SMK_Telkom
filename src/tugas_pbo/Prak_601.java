package tugas_pbo;
import java.io.*;

public class Prak_601 {

    public static void main(String[] args) throws Exception{
        File file = new File ("Prak_501.java");
        if (!file.exists() || !file.canRead()){
            System.out.println("can't read "+ file );
            return;
        } 
        try{
            int i=0;
            BufferedReader fln = new BufferedReader (new FileReader(file));
            String line;
            while ((line = fln.readLine()) !=null) {
                i++;
                System.out.println(i+" : "+line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File tidak ditemukan");
        }
    }
    
}
