package Patterns;

public class pattern7 {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            //spaces
            for(int j=0; j<5-i+1; j++){
                System.out.print(" ");
            }
            //stars
            for (int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    