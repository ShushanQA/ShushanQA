import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {


    public static void sortList(List<String> list, Comparator<String> comparator) {
        list.sort(comparator);
    }

    public static void main(String[] args) {
        String[] array = new String[]{"January", "February", "Mar", "Apr", "May", "June", "Jul", "august", "Sep", "Oct", "nov", "December"};
        List<String> list = Arrays.asList(array);
        Comparator<String> comparator = Comparator.comparing(String::toLowerCase);
        sortList(list, comparator);
        System.out.println(list);
    }
}