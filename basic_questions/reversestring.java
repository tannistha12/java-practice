package basic_questions;
//Loop Method
class reversestring{
    public static void main(String[] args){
        String word = "Tannistha";
        String revered = "";
        for (int i=0;i<word.length();i++){
            revered = word.charAt(i) + revered;
        }
        System.out.println("Reversed String is: " +revered);
    }
}

// StringBuilder Method
/*class main3{
 *   public static void main(String[] args){
 *       String word = "Tannistha";
 *       StringBuilder sb = new StringBuilder(word);
 *       String reversed = sb.reverse().toString();
 *       System.out.println("Reversed String is: " +reversed);
 *   }
} */