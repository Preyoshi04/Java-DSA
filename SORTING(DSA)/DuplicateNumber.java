//in an array of length (n+1)in range of 1 to n, find the number which has its duplicate

import java.util.Scanner;

public class DuplicateNumber {
    public int duplicateNo(int[] arr) {
        // first sorting the array uing cyclic sort bcz of range
        // then check whether all elemnts r in right plcae, if any elemnt is not in
        // correct index,but the correct index alrdy has the value, the that is a
        // duplicate, return tht value
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int index = arr[i] - 1;
                if (arr[i] != arr[index]) {
                    swap(arr, i, index); // doing sort
                } else {
                    return arr[i]; // if alrdy sorted nd extra found, then it is the duplicate
                }
            } else {
                i++;
            }
        }
        return -1; // no duplicates
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of the array(from 0 to?):");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        DuplicateNumber obj = new DuplicateNumber();
        System.out.println(obj.duplicateNo(arr));

        sc.close();
    }
}
