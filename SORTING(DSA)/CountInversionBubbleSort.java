import java.util.*;

public class CountInversionBubbleSort {
    static int inversionCount(int arr[]) {
        // Code Here
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    System.out.println(arr[j]+" is swapped with "+arr[j-1]);
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size");
        int n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Inversion count is "+inversionCount(arr));
    }
}