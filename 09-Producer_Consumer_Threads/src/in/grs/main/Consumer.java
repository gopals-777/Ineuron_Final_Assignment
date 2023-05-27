package in.grs.main;

import java.util.Queue;

class Consumer {
	private Queue<Integer> queue;

	public Consumer(Queue<Integer> queue) {
		this.queue = queue;
	}

	public void consume() {
		while (true) {
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
		}
	}
}