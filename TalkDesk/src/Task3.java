import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Task3 {


    public static void main(String[] args) {
        List<Integer> set1 = Arrays.asList(3, 5, 768, 3, 6, 23, 98, 38, 32, 45, 34, 234);
        List<Integer> set2 = Arrays.asList(10, 12, 43, 74, 25, 56, 37, 98, 29, 10);

        Integer solution = solve(set1, set2);
        System.out.println(solution);
    }

    private static Integer solve(List<Integer> set1, List<Integer> set2) {
        HashMap<Character, Integer> digitFrequency = new HashMap<>(10);
        for (Integer integer : set1) {
            for (char c : integer.toString().toCharArray()) {
                digitFrequency.put(c, digitFrequency.getOrDefault(c, 0) + 1);
            }
        }
        final char[] mostFreqDig = new char[1];
        final Integer[] freq = {0};
        digitFrequency.forEach((k, v) -> {
            if (v > freq[0]) {
                mostFreqDig[0] = k;
                freq[0] = v;
            }
        });

        return set2.get(Integer.parseInt(mostFreqDig[0] + "") - 1) + set2.get(freq[0] - 1);
    }
}