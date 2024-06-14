public class BitwiseOperations {
    public static void main(String[] args) {
        bitwiseAND(6, 23);

        bitwiseOR(6, 23);

        bitwiseXOR(6, 23);
    }

    public static Integer bitwiseAND(Integer n1, Integer n2){
        return (n1 & n2);
    }

    public static Integer bitwiseOR(Integer n1, Integer n2){
        return (n1 | n2);
    }

    public static Integer bitwiseXOR(Integer n1, Integer n2){
        return (n1 ^ n2);
    }
}
