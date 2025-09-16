import java.util.Scanner;

public class Factorial {
    public static int facto(int n)
    {
        if(n<=1)
        {
            return n;
        }
        int factorial = n*facto(n-1);
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(facto(n));
    }
}
