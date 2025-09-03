// Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[]. 

import java.util.Scanner;

public class NumberOfOccurence {
    static int countFreq(int[] arr, int target) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to serach for:");
        int target=sc.nextInt();
        System.out.println(countFreq(arr,target));
        sc.close();
    }
}
