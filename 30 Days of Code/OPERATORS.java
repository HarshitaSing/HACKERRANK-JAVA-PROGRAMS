import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        double tip,tax;
        double totalCost;
      tip=(mealCost*tipPercent)/100;
      tax=(mealCost*taxPercent)/100;
      totalCost=mealCost+tip+tax;
      // Write your calculation code here.
      double c=(double) totalCost;
        // cast the result of the rounding operation to an int and save it as totalCost 
         //totalCost = (int) Math.round(totalCost/*numberToRoundHere*/);
      
       System.out.println("The total meal cost is"+" " + Math.round(c) + " " +"dollars."); // Print your result
    }
}
