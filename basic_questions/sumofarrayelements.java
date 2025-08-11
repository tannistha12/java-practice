package basic_questions;
import java.util.Scanner;
class sumofarrayelements{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int size = obj.nextInt();
        int numbers[] = new int[size];
        int sum = 0;
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            numbers[i] = obj.nextInt();
            sum += numbers[i];
        }
        System.out.println("The sum of the array elements is: " + sum);
        obj.close();
    }
}