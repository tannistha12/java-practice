package Patterns;

public class pattern8 {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < (2 * 5 - (2 * i + 1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
