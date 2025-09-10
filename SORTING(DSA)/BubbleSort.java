import java.util.*;

public class BubbleSort 
{
    public static void bubbleSort(int[] arr)
    {
        boolean swapped;
        for(int i=0;i<arr.length;i++)
        {
            swapped=false;
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    swapArr(arr,j,j-1);
                    swapped=true;
                }
            }
            if(swapped)
            {
                break;
            }
            System.out.println("Array is already sorted!");
            return;
        }
        System.out.println("Array after sorting is:");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void swapArr(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        sc.close();
    }
}
