package basic_questions;
import java.util.Scanner;
public class stringtoarray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string to convert to an array: ");
        String charInput = obj.nextLine();
        char[] charArray = charInput.toCharArray();
        System.out.println("The character array is: ");
        for (char c : charArray){
            System.out.print(c + " ");
        }
        System.out.println("\n");
    }
}