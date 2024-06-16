public class HowMuchIsTheTrue {
    public static void main(String[] args) {
        //Create a function which returns the number of true values there are in an array.
        countTrue(new boolean[]{true, false, false, true, false});
    }

    public static int countTrue(boolean[] arr) {
        
        Integer qtd = 0;

        if(arr.length == 0){
            return 0;
        }

        for (boolean b : arr) {
            if(b==true){
                qtd++;
            }
        }
        return qtd;
    }
}
    