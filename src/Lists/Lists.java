package Lists;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Alfa");
        list.add("Delta");
        list.add("Charlie");
        System.out.println("List: " + list);
        System.out.println("Changing: " + list.get(1) + "\n");
        list.set(1, "Bravo");
        list.forEach((x) -> System.out.println("Element: " + x));
    }
}
