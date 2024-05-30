import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMaps2 {
    static HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("Enter student's name: ");
            String name = sc.next();
            System.out.print("Enter student's grade: ");
            int grande = sc.nextInt();
            add(name, grande);
            display();

        }


    }

    private static void add(String name, Integer integer) {
        if (!hashMap.containsKey(name)) {
            hashMap.put(name, new ArrayList<>());
        }
        hashMap.get(name).add(integer);
    }

    private static void display() {
        for (Map.Entry<String, ArrayList<Integer>> entry : hashMap.entrySet()) {
            int sum = 0;
            for (int value : entry.getValue()) {
                sum += value;
            }
            sum /= entry.getValue().size();
            System.out.println(entry.getKey() + "=" + sum);
        }
    }
}

