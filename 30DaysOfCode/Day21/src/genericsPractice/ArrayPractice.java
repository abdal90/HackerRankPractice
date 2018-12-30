package genericsPractice;

public class ArrayPractice {

    public static <E> void printArray(E[] array){

        for (E element: array) {
            System.out.print(element + " ");
        }
        System.out.println();
        /*for (int i = 0; i < array.length; i++) {
            E item = array[i];
            System.out.println(item);
            if (i < array.length - 1){
                System.out.println(", ");
            }
        }*/
    }


    public static void main(String[] args) {
        Integer[] intArray1;
        Integer[] intArray2 = new Integer[4];
        printArray(intArray2);

        String[] shoppingList = {"Bananas", "apples", "pears"};
        printArray(shoppingList);

    }


}
