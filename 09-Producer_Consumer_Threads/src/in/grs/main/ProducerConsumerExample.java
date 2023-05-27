package in.grs.main;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int maxSize = 10;

		Producer producer = new Producer(queue, maxSize);
		Consumer consumer = new Consumer(queue);

		Thread producerThread = new Thread(() -> {
			producer.produce();
		});

		Thread consumerThread = new Thread(() -> {
			consumer.consume();
		});

        producerThread.start();
        consumerThread.start();
    }
}