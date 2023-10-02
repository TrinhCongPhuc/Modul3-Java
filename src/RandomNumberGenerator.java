package BT_SS10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(20);
            queue.offer(randomNumber);
        }

        System.out.println("Random Numbers:");

        while (!queue.isEmpty()) {
            int number = queue.poll();
            System.out.println(number);
        }
    }
}
