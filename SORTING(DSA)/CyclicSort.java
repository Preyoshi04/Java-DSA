// everytime, if elements of array are in range of 1-n, cyclic sort is used..
// whenever this array will be soted.. elemnts will be in such a way that value at index i  will be (i+1)

import java.util.Scanner;

public class CyclicSort 
{
    public void cyclicSort(int[] arr)
    {
        //we traverse the array, take the first elemnt and check whether its at right index, if not, swap or else increase the index
        int i = 0;
        while(i<arr.length)
        {
            int index = arr[i]-1;
            if(arr[index]!=arr[i])
            {
                swap(arr,i,index);
            }
            else
            {
                i++;
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
    static void swap(int[] arr,int i,int j)
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
       CyclicSort obj = new CyclicSort();
       obj.cyclicSort(arr);

       sc.close();
    }
}
