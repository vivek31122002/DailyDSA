package arrays;

import java.util.* ;
import java.io.*; 
public class SecondLargestElement {
	 public static int findSecondLargest(int n, int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int largest = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                return arr[i];
            }
        }
        return -1;
    }
}
