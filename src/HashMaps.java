import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class HashMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();
        double sum;
        int current = 0;

        while (true) {
            System.out.print("Enter student's name: ");
            String name = sc.next();
            System.out.print("Enter student's grade: ");
            int grande = sc.nextInt();
            if (hashMap.containsKey(name)){
                hashMap.put(name, grande);
            }
            System.out.println("|Name: " + name + "|" + "\n" + "|grande:" + grande + "|");
            current++;
            sum = ( (double)hashMap.get(name) + hashMap.get(name) ) / current;
            System.out.println("Средняя оценка студентов: " + (sum) + "\n" + "Кол-во студентов: " + current);
        }

    }


}
