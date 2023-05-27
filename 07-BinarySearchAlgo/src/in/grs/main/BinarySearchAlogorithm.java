package in.grs.main;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlogorithm {
	public static void main(String[] args) {
		int[] numbers = {2, 5, 7, 10, 15, 20, 25, 30};

        // Sorting the array (binary search requires a sorted array)
        Arrays.sort(numbers);

        // Accepting user input for the target value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        // Performing binary search
        int index = binarySearch(numbers, target);

        if (index >= 0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
		

	}

