import java.util.ArrayList;
import java.util.Scanner;

public class AllDuplicatesInArray 
{
public ArrayList<Integer> duplicateNo(int[] arr) {

        ArrayList<Integer> res = new ArrayList<>();
        // first sorting the array uing cyclic sort bcz of range
        // then check whether all elemnts r in right plcae, if any elemnt is not in
        // correct index,but the correct index alrdy has the value, the that is a
        // duplicate, added them to the arraylist
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int index = arr[i] - 1;
                if (arr[i] != arr[index]) {
                    swap(arr, i, index); // doing sort
                } else {         //if alrdy sorted nd extra found, then it is the duplicate
                    if(!res.contains(arr[i])) //if list alrdy have tht, thn do not duplicate that no again
                    {
                        res.add(arr[i]);
                    }
                    i++;   //one duplicate found and stored, then move to next , so increment
                }
            } else {
                i++;
            }
        }
        return res; // no duplicates
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
        
        AllDuplicatesInArray obj = new AllDuplicatesInArray();
        ArrayList result = obj.duplicateNo(arr);
        System.out.println(result);

        sc.close();
    }
}
