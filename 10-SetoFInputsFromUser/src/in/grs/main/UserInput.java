package in.grs.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();

		// Read integers from the user and add them to the list
		System.out.print("Enter the number of integers: ");
		int count = scanner.nextInt();

		System.out.println("Enter the integers:");
		for (int i = 0; i < count; i++) {
			int number = scanner.nextInt();
			numbers.add(number);
		}

		// Find the second largest and second smallest elements
		int secondLargest = findSecondLargest(numbers);
		int secondSmallest = findSecondSmallest(numbers);

		// Print the results
		System.out.println("Second largest: " + secondLargest);
		System.out.println("Second smallest: " + secondSmallest);
	}

	private static int findSecondLargest(List<Integer> numbers) {
		if (numbers.size() < 2) {
			throw new IllegalArgumentException("List must contain at least two elements");
		}

		List<Integer> sortedList = new ArrayList<>(numbers);
		Collections.sort(sortedList, Collections.reverseOrder());

		return sortedList.get(1);
	}

	private static int findSecondSmallest(List<Integer> numbers) {
		if (numbers.size() < 2) {
			throw new IllegalArgumentException("List must contain at least two elements");
		}

		List<Integer> sortedList = new ArrayList<>(numbers);
		Collections.sort(sortedList);

		return sortedList.get(1);
	}
}
