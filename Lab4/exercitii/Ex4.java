package exercitii;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex4 {
    public static void main(String[] args) {
        Ex4 ex4 = new Ex4();
        int[] numbers = new int[5];

        numbers[0] = 5;
        numbers[1] = 7;
        numbers[2] = 5;
        numbers[3] = 4;
        numbers[4] = 7;

        System.out.println(ex4.removeDuplicates(numbers));
    }

    public int removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i : arr) {
            set.add(i);
        }

        return set.size();
    }
}
