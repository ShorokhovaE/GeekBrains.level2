package lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    private Map <String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String firstName, String phoneNumber){
        if (!phoneBook.containsKey(firstName)){
            ArrayList<String> numbersBook = new ArrayList<>();
            numbersBook.add(phoneNumber);
            phoneBook.put(firstName, numbersBook);
        } else {
            phoneBook.get(firstName).add(phoneNumber);
        };
    }

    public ArrayList<String> get(String firstName){
    return phoneBook.get(firstName);
    };
}
