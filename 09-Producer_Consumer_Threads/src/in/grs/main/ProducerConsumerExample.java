package in.grs.main;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int maxSize = 10;
		int maxIterations = 10;

		Producer producer = new Producer(queue, maxSize, maxIterations);
		Consumer consumer = new Consumer(queue, maxIterations);

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
