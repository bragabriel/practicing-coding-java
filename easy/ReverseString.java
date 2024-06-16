public class ReverseString {
    public static void main(String[] args) {
        //Create a method that reverses a string without using existing function
        System.out.println(reverseString("Carro"));
    }

    public static String reverseString(String str){
        
        String aux = "";

        for(Integer i = 0; i < str.length(); i++){
            aux = str.charAt(i) + aux;
        }
        return aux;
    }
}
