import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int sumA = A.length();
        int sumB = B.length();

        int total = sumA + sumB;
        System.out.println(total);

        if(A.compareTo(B) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");

        String nameA = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();
        String nameB = B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.println(nameA + " " +nameB);
        
    }
}



