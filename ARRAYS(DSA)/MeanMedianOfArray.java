import java.util.Arrays;
import java.util.Scanner;

public class MeanMedianOfArray
{
    public int mean(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return (sum/arr.length);
    }
    public int median(int[] arr)
    {
        Arrays.sort(arr);
        int mid = arr.length-1;
        if(arr.length%2!=0)
        {
            return arr[mid];
        }
        else
        {
            return ((arr[mid-1]+arr[mid])/2);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before reversing:-");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        MeanMedianOfArray obj = new MeanMedianOfArray();
        System.out.println("Mean is "+obj.mean(arr)+" and median is "+obj.median(arr));
    }
}