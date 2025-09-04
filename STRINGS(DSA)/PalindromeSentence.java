import java.util.*;

public class PalindromeSentence 
{
    public static boolean palindromeSent(String s)
    {
        s=s.toLowerCase().replace("[^a-z0-9]", "");
        StringBuilder str = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            str.append(s.charAt(i));
        }
        return str.toString().equals(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence:");
        String str = sc.nextLine();
        System.out.println(palindromeSent(str));
    }
}
