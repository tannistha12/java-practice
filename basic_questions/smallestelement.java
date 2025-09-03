package basic_questions;
import java.util.Scanner;
public class smallestelement {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
        // ask user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = obj.nextInt();

        //create an array of size n
        int[] arr = new int[n];

        // ask user to input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        // initialize the smallest element to the first element of the array
        int lowest = arr[0];
        // iterate through the array to find the smallest element
        for (int low : arr){
            if (low < lowest){
                lowest = low;
            }
        }
        // print the smallest element
        System.out.println("The smallest element in the array is: " + lowest);
        obj.close();
    }
}
