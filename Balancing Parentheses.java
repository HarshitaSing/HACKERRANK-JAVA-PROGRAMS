import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) 
        {
			String input=sc.next();
            //Complete the code
            Stack<Character> stk=new Stack<>();
            int flag=1;
            for(int i=0;i<input.length();i++)
            {
                char top = input.charAt(i);
                if((top == '(') || (top == '{') || (top == '['))
                {
                    stk.push(top);
                }
                else
                {
                    if(!stk.isEmpty())
                    {
                        char last = stk.peek();
                        if( (last=='(' && top==')') || (last=='{' && top=='}') || (last=='[' && top==']'))
                                stk.pop();
                        else
                            flag=0;
                        
                    }
                    else
                            flag=0;  
                }
                
            }
            if(stk.isEmpty() && flag==1)
                System.out.println( "true");
            else
                System.out.println("false");
		}
		
	}
}





