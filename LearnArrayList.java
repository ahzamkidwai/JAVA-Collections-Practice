import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class LearnArrayList {

    public static void main(String[] args) {
        /*
         * List<Integer> list = new ArrayList<>();
         * list.add(10);
         * list.add(20);
         * list.add(30);
         * list.add(40);
         * list.add(50);
         * list.add(60);
         * list.add(70);
         * list.add(80);
         * list.add(90);
         * 
         * // System.out.println(list);
         * 
         * for (int i = 0; i < list.size(); i++) {
         * System.out.print(list.get(i) + " ");
         * }
         * 
         * Iterator<Integer> it = list.iterator();
         * 
         * System.out.println("\nPrinting List using Iterator : ");
         * 
         * while (it.hasNext()) {
         * System.out.println(it.next());
         * }
         */

        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Elephant");
        animals.push("Monkey");
        animals.push("Dog");

        System.out.println("Stack is : " + animals);

        System.out.println("Top element of a stack is : " + animals.peek());

        animals.pop();

        System.out.println("Top element of a stack is : " + animals.peek());
    }
}