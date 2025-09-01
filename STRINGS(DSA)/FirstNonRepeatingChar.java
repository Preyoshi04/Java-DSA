import java.util.*;

public class FirstNonRepeatingChar 
{
    public static char nonRep(String str)
    {
        int[] freq = new int[26];     //to have 26lowercase alphabets
        str=str.toLowerCase();
        for(char c : str.toCharArray())          //counting frequency of each character
        {
            freq[c-'a']++;
        }

        for(char c : str.toCharArray())
        {
            if(freq[c-'a'] == 1)
            {
                return c;
            }
        }
        return '$';
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(nonRep(str));
    }
}
