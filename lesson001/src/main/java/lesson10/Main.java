package lesson10;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static ArrayList<String> list;

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList(Arrays.asList("a", "ab","b", "c", "d", "a", "a", "c", "d", "d", "d"));
        Map<String, Integer> mp = new HashMap<>();

        countIn(list, mp);
        printResult(list, mp);

    }

    private static void printResult(ArrayList<String> list, Map<String, Integer> mp) {
        Main.list = list;
        System.out.println("Задан массив из слов: ");
        System.out.println(list);
        System.out.println();
        System.out.println("Решение: ");
        System.out.println("Слово:число вхождений");

        mp.forEach((key, val) -> System.out.println(MessageFormat.format("{0}:{1}", key, val)));
    }

    private static void countIn(ArrayList<String> list, Map<String, Integer> mp) {
        int k;
        for (int i = 0; i < list.size(); i++) {
            if (!mp.containsKey(list.get(i))) {
                k = 1;
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) {
                        k++;
                    }
                    mp.put(list.get(i), k);
                }
            }
        }
    }
}
