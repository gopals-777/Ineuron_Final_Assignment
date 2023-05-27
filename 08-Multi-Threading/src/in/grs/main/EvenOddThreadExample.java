package in.grs.main;
public class EvenOddThreadExample {
    public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread evenThread = new Thread(r);
		Thread oddThread = new Thread(r);

        evenThread.start();
        oddThread.start();

		evenThread.setName("EvenThread");
		oddThread.setName("OddThread");
    }
}

class MyRunnable implements Runnable {
    private int start;
    private int end;

    public MyRunnable() {
        this.start = 1;
        this.end = 10;
    }

    @Override
    public void run() {
        String threadType = Thread.currentThread().getName();

		if (threadType.equals("EvenThread")) {
            printEvenNumbers();
		} else if (threadType.equals("OddThread")) {
            printOddNumbers();
        }
    }

    private void printEvenNumbers() {
		System.out.println("EvenThread is exceuting....." + Thread.currentThread().getName());
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }

    private void printOddNumbers() {
		System.out.println("OddThread is exceuting....." + Thread.currentThread().getName());
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}
