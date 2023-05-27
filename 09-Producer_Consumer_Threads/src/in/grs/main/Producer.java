package in.grs.main;

import java.util.Queue;
import java.util.Random;

class Producer {
	private Queue<Integer> queue;
	private int maxSize;
	private int maxIterations;

	public Producer(Queue<Integer> queue, int maxSize, int maxIterations) {
		this.queue = queue;
		this.maxSize = maxSize;
		this.maxIterations = maxIterations;
	}

	public void produce() {
		int iterations = 0;
		while (iterations < maxIterations) {
			synchronized (queue) {
				while (queue.size() >= maxSize) {
					try {
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				Random random = new Random();
				int number = random.nextInt(100);
				queue.add(number);
				System.out.println("Produced: " + number);

				queue.notifyAll();
			}
			iterations++;
		}
	}
}