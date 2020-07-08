import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i =0; i<n; i++)
        {
            int val = sc.nextInt();
            list.add(val);
        }
        int q = sc.nextInt();
        //String str;
        for(int j=0;j<q;j++)
        {
            String str = sc.next();
            int x,y,z;
            if(str.equals("Insert"))
            {
                x=sc.nextInt();
                y=sc.nextInt();
                list.add(x,y);
            }
            if(str.equals("Delete"))
            {
                z=sc.nextInt();
                list.remove(z);
            }
    }

    for(int k=0;k<list.size();k++)
    {
        System.out.print(list.get(k) + " ");
    }
}
}
