package HomeWork3;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] words = {"dd", "ff", "gg", "hh", "jj", "dd", "kk", "ll", "dd", "ff", "gg", "hh"};
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> hmap = new HashMap<>();
        for (String x : words) {
            hmap.put(x, hmap.getOrDefault(x, 0) + 1);
        }
        System.out.println(hmap);

        Phone phBook = new Phone();
        phBook.add("Иванов", "85451212");
        phBook.add("Петров", "84263786");
        phBook.add("Петров", "8666676");
        phBook.add("Иванов", "82565235");
        phBook.add("Сидоров", "82256642");

        System.out.println("Тел:" + phBook.get("Иванов"));
        System.out.println("Тел:" + phBook.get("Петров"));
        System.out.println("Тел:" + phBook.get("Сидоров"));
    }
}
