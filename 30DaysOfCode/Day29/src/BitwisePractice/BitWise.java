package BitwisePractice;

public class BitWise {

    // The code below converts a word and an integer to binary strings

    BitWise(String string){
        for( byte b : string.getBytes() ){
            System.out.print(Integer.toBinaryString(b) + " ");
        }
        System.out.println();
    }

    BitWise(Integer integer){
        System.out.println(Integer.toBinaryString(integer));
    }

    public static void main(String[] args) {
        new BitWise("HackerRank");
        new BitWise(8675309);
    }

}

// modify the above class to find and print the OR of each character in the string with 8675309

class BinaryString {

    BinaryString(String string, Integer integer){
        String binaryInteger = Integer.toBinaryString(integer);

        for( byte b : string.getBytes() ){
            // Perform a bitwise operation using byte and integer operands, save result as tmp:
            int tmp = b | integer;
            System.out.println( Integer.toBinaryString(b) + " OR " + Integer.toBinaryString(integer)
                    + " = " + Integer.toBinaryString(tmp) + " = " + tmp );
        }
    }

    public static void main(String[] args) {
        new BinaryString("HackerRank", 8675309);
    }
}

// modify the above class to find and print the XOR of each character in the string with 8675309
class BinaryString2 {

    BinaryString2(String string, Integer integer){
        String binaryInteger = Integer.toBinaryString(integer);

        for( byte b : string.getBytes() ){
            // Perform a bitwise operation using byte and integer operands, save result as tmp:
            int tmp = b ^ integer;
            System.out.println( Integer.toBinaryString(b) + " XOR " + Integer.toBinaryString(integer)
                    + " = " + Integer.toBinaryString(tmp) + " = " + tmp );
        }
    }

    public static void main(String[] args) {
        new BinaryString2("HackerRank", 8675309);
    }
}