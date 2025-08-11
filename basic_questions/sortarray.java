package basic_questions;
import java.util.Arrays;
import java.util.Scanner;
public class sortarray {
    public static void main(String[] args){
        Scanner obj = new Scanner (System.in);
        /*/
        // asking user for the number of elements in the array
        System.out.println("Enter the number of elements in the array: ");
        int size = obj.nextInt();

        //create an array of size 'size'
        int[] arr = new int[size];

        //asking user to input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++){
            arr[i] = obj.nextInt();
        }
        //sorting the array
        Arrays.sort(arr);
        System.out.print("The sorted array is: ");
        for (int num : arr){
            System.out.print(num + " ");
        */

        System.out.println("Enter the number of strings in the array: ");
        int size = obj.nextInt();
        obj.nextLine(); // consume the newline character

        //create an array and take input from the user
        String[] words = new String[size];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < size; i++){
            words[i] = obj.nextLine();
        }
        //sorting the array
        Arrays.sort(words);
        System.out.println("The sorted array is: ");
        for (String j : words){
            System.out.print(j + " ");
        }
    }
}

