import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int arr[] = new int[26],arr1[] = new int[26];
        a = a.toUpperCase();
        b = b.toUpperCase();
        if(a.length() != b.length())
            return false;
        for(int i=0;i<a.length();i++)
        {
            arr[a.charAt(i) - 'A']++;
            arr1[b.charAt(i) - 'A']++;
            System.out.println(arr[i]+ ' ' + arr1[i]);
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i] != arr1[i])
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}