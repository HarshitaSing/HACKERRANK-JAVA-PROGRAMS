//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
        Map<String,Integer> map = new HashMap<String,Integer>();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            //in.nextLine();
            map.put(name,phone);
			in.nextLine();
		}
        //nt q= sc.nextInt();
        while(in.hasNext())
        {
            String str = in.nextLine();
            //int value = map.get(str);
            System.out.println(map.containsKey(str)? str +"="+ map.get(str):"Not found");
        }
		/*while(in.hasNext())
		{
			String s=in.nextLine();
		}*/
	}
}



