// [1,2,3,4,5,6,7,8]  k=3  ---> [6,7,8,1,2,3,4,5]
// reverse whole array ---> [8,7,6,5,4,3,2,1]
// reverse from 0 to k-1(2) ---> [6,7,8,5,4,3,2,1]
// reverse rest from k to arr.length ----> [6,7,8,1,2,3,4,5]

import java.util.*;

public class RightRotateArray {
    public static void rightRotation(int[] arr , int step)
    {
        //if d>size
        step=step%arr.length;
        //reverse whole array
        reverseArray(arr, 0, arr.length-1);

        //reverse from 0 to k-1
        reverseArray(arr, 0, step-1);
        
        //reverse rest from k to arr.length
        reverseArray(arr, step, arr.length-1);
        
        System.out.println("Array after right rotation by "+step+"steps is: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverseArray(int[] arr,int startIndex,int endIndex)
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
        System.out.println("Array before right rotation by "+step+"steps is: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        rightRotation(arr,step);
    }
}
