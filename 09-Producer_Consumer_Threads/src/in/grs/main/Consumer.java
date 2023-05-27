package in.grs.main;

import java.util.Queue;

class Consumer {
	private Queue<Integer> queue;
	private int maxIterations;

	public Consumer(Queue<Integer> queue, int maxIterations) {
		this.queue = queue;
		this.maxIterations = maxIterations;
	}

	public void consume() {
		int iterations = 0;
		while (iterations < maxIterations) {
			synchronized (queue) {
				while (queue.isEmpty()) {
					try {
						queue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				int sum = 0;
				while (!queue.isEmpty()) {
					int number = queue.poll();
					sum += number;
				}
				System.out.println("Consumed. Sum: " + sum);

				queue.notifyAll();
			}
			iterations++;
		}
	}
}