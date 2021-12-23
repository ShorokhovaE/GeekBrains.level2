package lesson3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] s = new String[15];  // Задание № 1
        s[0] = "Яблоко";
        s[1] = "Груша";
        s[2] = "Яблоко";
        s[3] = "Мандарин";
        s[4] = "Вишня";
        s[5] = "Груша";
        s[6] = "Мандарин";
        s[7] = "Яблоко";
        s[8] = "Яблоко";
        s[9] = "Вишня";
        s[10] = "Яблоко";
        s[11] = "Груша";
        s[12] = "Яблоко";
        s[13] = "Яблоко";
        s[14] = "Вишня";

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length; i++) {
            Integer count = map.getOrDefault(s[i], 0);
            map.put(s[i], count+1);
        }
        System.out.println("Список уникальных слов массива: " + map.keySet());
        System.out.println("Сколько раз встречается каждое слово: " + map);


        Phonebook phonebook = new Phonebook();  // Задание № 2
        phonebook.add("Иванов", "8888");
        phonebook.add("Иванов", "9999");
        phonebook.add("Иванов", "777");
        phonebook.add("Петров", "6565");
        phonebook.add("Килькина", "8");

        System.out.println(phonebook.get("Петров"));
        System.out.println(phonebook.get("Иванов"));



    }

}
