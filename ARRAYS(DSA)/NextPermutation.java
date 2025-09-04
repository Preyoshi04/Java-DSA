// permutations in nos of arrays.. "inputwise combination is the current permutation".. output will be next permutation(next bigger number possible with the nos..)
// [1,2,5,3,7] --> [1,2,5,7,3]
// first traversing the array from right and checking whether all the elements is smaller than the prev one.. (if so, then it is the ;argest permutation,, we should reverse the whole array and return it...)
// next, if any larger element found (arr[i]<arr[i+1])..then set the index of arr[i] as pivot.. (we wont touch left side of pivot)
// next, check if any number on the ritgh side of pivot is greater than it's element(arr[i]>arr[pivot]) , then swap both
// next, reverse the right side of the pivot.. and we get the ans..
// [1,2,5,3,7] --> (7 is greater than 3) --> pivot is 3(el:3)
// second iteration pivot's right side.. (7 greater than 3. swap)
// [1,2,5,3,7]-->reverse the right side ---> [1,2,5,7,3]

import java.util.Scanner;

public class NextPermutation 
{
    public static void nextPermutation(int[] arr)
    {
        int pivot = -1;
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                pivot = i;
                break;
            }
        }

        if(pivot == -1)
        {
            reverseArr(arr, 0, arr.length-1);
        }
        else
        {
            for(int i=arr.length-1;i>pivot;i--)
        {
            if(arr[i]>arr[pivot])
            {
                swap(arr, pivot, i);
                break;
            }
        }
        reverseArr(arr, pivot+1, arr.length-1);
        }
        
        System.out.println("Array's next permutation is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void reverseArr(int[] arr,int start,int end)
    {
        while(start < end)
        {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        nextPermutation(arr);
    }
}
