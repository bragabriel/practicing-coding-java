public class FizzBuzz{
    
    public static void main(String[] args) {
        //Create a function that takes a number as an argument and returns "Fizz", "Buzz" or "FizzBuzz".
        System.out.println(fizzBuzz(3)); // "Fizz"

        System.out.println(fizzBuzz(5)); // "Buzz"

        System.out.println(fizzBuzz(15)); // "FizzBuzz"

        System.out.println(fizzBuzz(4)); // "4"
    }

    public static String fizzBuzz(Integer num){

        String str = "";

        if(num % 3 == 0){
            str += "Fizz";
        }
        if(num % 5 == 0){
            str += "Buzz";
        }
        if(num % 3 != 0 && num % 5 != 0){
            str = num.toString();
        }
        return str;
    }
}