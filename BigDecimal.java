import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        Arrays.sort(s, new Comparator<String>() {
        @Override
        public int compare(String a1, String b1) {
        if (a1 == null || b1 == null) {
            return 0;
        }
        BigDecimal A = new BigDecimal(a1);
        BigDecimal B = new BigDecimal(b1);
        return B.compareTo(A);
        }
    });
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}