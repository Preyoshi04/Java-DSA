// floor of a number means finding the biggest number which is smaller than or equal to the target number
// doing basic binary serach
// added one conditiion, if the targrt is smaller than the smallest no (arr[0]), then return -1, else return arr[end]

import java.util.*;

public class FloorOfNumberInArray {
    public static int getFloor(int[]arr,int target)
    {
        int start=0,end=arr.length-1;
        if(target<arr[start])
        {
            return -1;
        }
        
        while(start<=end)
        {
            int mid = (start+end)/2;

            if(arr[mid]==target)
            {
                return arr[mid];
            }
            else if(arr[mid]<target)
            {
                start = mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return arr[end];
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array (sorted array):");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to serach for:");
        int target=sc.nextInt();
        System.out.println(getFloor(arr,target));
        sc.close();
    }
}
