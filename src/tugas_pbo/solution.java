package tugas_pbo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class solution {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double payment = scanner.nextDouble();
        NumberFormat usnf=
                NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat innf=
                NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        System.out.println("US Format = "+usnf.format(payment));
        System.out.println("India format = "+innf.format(payment));
        scanner.close();
    }
    
}
