import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        System.out.println("Minimum elements is : " + Collections.min(list));
        System.out.println("Maximum elements is : " + Collections.max(list));
        System.out.println("Frequency of an element is : " + Collections.frequency(list, 9));

        // To sort the list in Ascending Order
        Collections.sort(list);
        // To sort the list in Descending Order
        Collections.sort(list, Comparator.reverseOrder());

        System.out.println("Sorted List is : " + list);
    }
}
