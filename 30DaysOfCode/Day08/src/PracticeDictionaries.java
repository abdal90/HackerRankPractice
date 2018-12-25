package src;

import java.util.HashMap;
import java.util.Map;

public class PracticeDictionaries {

    public static void main(String[] args) {
        // English to spanish dictionary
        Map<String, String> englSpanDictionary = new HashMap<>();

        // inserting into dicrioanry
        englSpanDictionary.put("Monday", "Lunas");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");

        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));

        // print all keys
        System.out.println(englSpanDictionary.keySet());

        // print values
        System.out.println(englSpanDictionary.values());

        // print size
        System.out.println(englSpanDictionary.size());

        System.out.println();
        System.out.println("================================");

        // create shopping list
        Map<String, Boolean> shoppingList = new HashMap<>();

        // put stuff in shopping list
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("eggs", Boolean.FALSE);
        shoppingList.put("sugar", false);

        // get items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreos"));

        // key value pair printout
        System.out.println(shoppingList.toString());
        // is the dictionary empty
        System.out.println(shoppingList.isEmpty());

        // remove
        shoppingList.remove("eggs");
        // key value pair printout
        System.out.println(shoppingList.toString());

        // replace values for a certain key
        shoppingList.replace("Bread", Boolean.TRUE, Boolean.FALSE);
        // key value pair printout
        System.out.println(shoppingList.toString());

        // clear dictionary
        shoppingList.clear();


    }
}
