import java.util.*;

class MinElementInSortedRotatedArray {
    public static int findMin(int[] arr) {
        // complete the function here    
        int start=0,end=arr.length-1;
        
        while(start<end)
        {
            int mid = (start+end)/2;
            
            if(arr[mid]>arr[end])
            {
                start = mid+1;       
            }
            else
            {
                end=mid;  
            }
        }
        return arr[start];
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array (after sorting and rotation):");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(findMin(arr));
        sc.close();
    }
}
