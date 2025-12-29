package week2day5;

import java.util.concurrent.CopyOnWriteArrayList;

public class failsafe {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        for (Integer n : numbers) {
            System.out.println(n);
            numbers.add(3);
        }

        System.out.println("Final List: " + numbers);
    }
}

