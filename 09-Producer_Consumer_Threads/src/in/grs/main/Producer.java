package in.grs.main;

import java.util.Queue;
import java.util.Random;

class Producer {
	private Queue<Integer> queue;
	private int maxSize;

	public Producer(Queue<Integer> queue, int maxSize) {
		this.queue = queue;
		this.maxSize = maxSize;
	}

	public void produce() {
		while (true) {
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
		}
	}
}