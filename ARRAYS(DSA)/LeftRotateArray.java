// [1,2,3,4,5,6,7,8]  k=3  ---> [4,5,6,7,8,1,2,3]
// reverse from 0 to k-1(2) ---> [3,2,1,4,5,6,7,8]
// reverse from k(3) to arr.length ----> [3,2,1,8,7,6,5,4]
// reverse the whole array ---> [4,5,6,7,8,1,2,3]

import java.util.*;

public class LeftRotateArray {
    public static void leftRotate(int[] arr,int step)
    {
        //if k > size
        step = step%arr.length;
        //reverse from 0 to k
        reverArr(arr, 0, step-1);

        // reverse from k+1(4) to arr.length
        reverArr(arr, step, arr.length-1);

        //reverse the whole array
        reverArr(arr, 0, arr.length-1);

        System.out.println("Array after left rotation by "+step+"steps is: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverArr(int[] arr, int startIndex, int endIndex)
    {
        for(int i=startIndex;i<endIndex;i++)
        {
            int temp = arr[startIndex];
            arr[startIndex]=arr[endIndex];
            arr[endIndex]=temp;
            startIndex++;
            endIndex--;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the step you want to rotate by:");
        int step=sc.nextInt();
        System.out.println("Array before left rotation by "+step+"steps is: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        leftRotate(arr,step);
    }
}
