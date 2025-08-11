package basic_questions;
import java.util.Scanner;
public class averageofarray {
    public static void main(String[] args){
        Scanner obj = new Scanner (System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = obj.nextInt();
        int[] arr = new int[n];;
        float sum = 0;
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
            sum += arr[i];
        }
        float avg = sum / n;
        System.out.print("The average of the array elements is: " + avg);
    }
}
