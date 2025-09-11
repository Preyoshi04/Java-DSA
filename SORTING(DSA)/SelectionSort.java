import java.util.Scanner;

public class SelectionSort 
{
    public void selectionSort(int[] arr)
    {
        //we will take the max element and swap with the last index..
        for(int i=0;i<arr.length;i++)
        {
            int lastIndex = arr.length-i-1;
            int max = getMax(arr,0,lastIndex);
            //swap the max with last index
            swap(arr,max,lastIndex); 
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int getMax(int[] arr,int start,int end)       //returning the index of the max element
    {
        int maximum=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[i]>arr[maximum])
            {
                maximum=i;
            }
        }
        return maximum;
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
       SelectionSort obj = new SelectionSort();
       obj.selectionSort(arr);

       sc.close();
    }
}
