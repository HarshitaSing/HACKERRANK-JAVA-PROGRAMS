import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int n;
        double k;
        String m ;
        n=scan.nextInt();
        k=scan.nextDouble();
        scan.nextLine();
        m=scan.nextLine();
        // m=scan.nextLine();
          /*Declare second integer, double, and String variables. */

        System.out.println(i+n); /* Print the sum of both integer variables on a new line. */
        System.out.println(d+k);
       System.out.println(s+m); /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        scan.close();