import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale localeIndia = new Locale("en", "IN");

        NumberFormat USA     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat INDIA  = NumberFormat.getCurrencyInstance(localeIndia);
        NumberFormat CHINA  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat FRANCE = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: "     + USA.format(payment));
        System.out.println("India: "  + INDIA.format(payment));
        System.out.println("China: "  + CHINA.format(payment));
        System.out.println("France: " + FRANCE.format(payment));
        
    }
}