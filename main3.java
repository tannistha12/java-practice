class main3{
    public static void main(String[] args){
        String word = "Tannistha";
        String revered = "";
        for (int i=0;i<word.length();i++){
            revered = word.charAt(i) + revered;
        }
        System.out.println("Reversed String is: " +revered);
    }
}
