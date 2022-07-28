import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 strings");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.next());
        }
        System.out.println("List A " + listA);

        System.out.println("Enter 5 strings");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.next());
        }
        System.out.println("List B " + listB);

        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(Math.abs(i-4)));
        }

        System.out.println("List C" + listC);

        listC.sort(new LengthFirstComparator());

        System.out.println("Sorted List C " + listC);
        }
}