import java.util.*;

class SecondLargest 
{
    public static int findSecondLargestElement(int[] arr)
    {   
        int largest = arr[0] , secondLargest =-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest)
            {
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The second largest element in the array is: "+findSecondLargestElement(arr));;
    }
}