package basic_questions;
class countwords{
    public static void main(String[] args) {
        String words = "One Two Three Four Five Six Seven Eight Nine Ten";
        int count = words.split("\\s+").length;
        System.out.println("The number of words in the sentence is: " + count);
    }
}