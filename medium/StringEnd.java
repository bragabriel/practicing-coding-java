public class StringEnd {
    public static void main(String[] args) {
        //Create a method that takes a string and returns the word count. The string will be a sentence.
        checkEnding("feminine", "nine");
    }

    //Create a function that takes two strings and returns true if the first string ends with the second string; otherwise return false.
    public static boolean checkEnding(String str1, String str2){
        if(str1.endsWith(str2)){
            return true;
        };
        return false;
    }
}
