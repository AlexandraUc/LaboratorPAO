package exercitii;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex3 {
    public static void main(String[] args) {
        Ex3 ex3 = new Ex3();
        ex3.countLetter("abracadabra");
    }

    public void countLetter(String s) {
        Map<Character, Integer> map = new TreeMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
