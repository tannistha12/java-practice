package basic_questions;
import java.util.Scanner;
class addintegers{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int x,y,sum;
        System.out.println("Enter first number:");
        x = obj.nextInt();
        System.out.println("Enter second number:");
        y = obj.nextInt();
        sum = x + y;
        System.out.println("Sum of two numbers is: " + sum);
        obj.close();
    }
}