import java.util.*;

public class InsertionSort 
{
    public void insertionSort(int[] arr)
    {
        //sorts the left hand size of the array
        //stepwise, 1st iteration-->array will be sorted upto index 1...2nd ietration-->array will be sorted upto index 2.. and so on
        //outer loop will run upto length-2, bcz inner loop is starting frm (i+1)
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)   //this will check whether elemnt is smaller thn prev, the swap otherwise, breaks
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else
                {
                    break;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
           System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
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
       InsertionSort obj = new InsertionSort();
       obj.insertionSort(arr);

       sc.close();
    }
}
