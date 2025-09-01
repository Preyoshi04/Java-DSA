import java.util.*;

public class Anagrams
{
    public static boolean isAnagram(String s1,String s2)
    {
        s1.toLowerCase();
        s2.toLowerCase();

        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(isAnagram(s1,s2));
    }
}