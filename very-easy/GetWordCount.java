public class GetWordCount {
    public static void main(String[] args) {
     //Create a method that takes a string and returns the word count. The string will be a sentence.
        countWords("Just an example here move along");
    }

    public static int countWords(String string){
        String[] words = string.split("\\s+");
        return words.length;
    }
}
