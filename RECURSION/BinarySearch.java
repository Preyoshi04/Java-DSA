public class BinarySearch {
    public static int binarySearch(int[] arr,int target,int start, int end)
    {
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(target == arr[mid])
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                return binarySearch(arr, target, start, mid-1);
            }
            else
            {
                return binarySearch(arr, target, mid+1, end);
            }
        }
        return -1;   
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        System.out.println(binarySearch(arr,target,0,4));
    }
}
