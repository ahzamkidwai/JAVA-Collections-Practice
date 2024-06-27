// import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>();
        Set<Integer> set = new LinkedHashSet<>();
        set.add(2);
        set.add(32);
        set.add(22);
        set.add(21);
        set.add(12);
        set.add(24);

        System.out.println("Set is : " + set);

        set.remove(24);

        System.out.println("Set is : " + set);

        // Check whether the element is present on the set or Not
        System.out.println(set.contains(21));

        // Check whether the set is empty or not
        System.out.println(set.isEmpty());

        System.out.println(set.size());

        // To clear all the elements of the set.
        set.clear();

        System.out.println(set);
    }
}
