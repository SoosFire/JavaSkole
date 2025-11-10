import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        int[] arr = readArrayFromFile("10000.txt");
        if (arr != null) {
            System.out.println("Original array size: " + arr.length);
            
            // Test different sorting algorithms
            testSortingAlgorithms(arr);
        }
    }

    public static void testSortingAlgorithms(int[] originalArr) {
        // Create copies for each algorithm to avoid sorting the same array multiple times
        int[] bubbleArr = originalArr.clone();
        int[] selectionArr = originalArr.clone();
        int[] insertionArr = originalArr.clone();
        int[] mergeArr = originalArr.clone();
        int[] quickArr = originalArr.clone();
        int[] heapArr = originalArr.clone();

        // Test Bubble Sort
        long startTime = System.currentTimeMillis();
        bubbleSort(bubbleArr);
        long endTime = System.currentTimeMillis();
        System.out.println("Bubble Sort completed in: " + (endTime - startTime) + " ms");

        // Test Selection Sort
        startTime = System.currentTimeMillis();
        selectionSort(selectionArr);
        endTime = System.currentTimeMillis();
        System.out.println("Selection Sort completed in: " + (endTime - startTime) + " ms");

        // Test Insertion Sort
        startTime = System.currentTimeMillis();
        insertionSort(insertionArr);
        endTime = System.currentTimeMillis();
        System.out.println("Insertion Sort completed in: " + (endTime - startTime) + " ms");

        // Test Merge Sort
        startTime = System.currentTimeMillis();
        mergeSort(mergeArr, 0, mergeArr.length - 1);
        endTime = System.currentTimeMillis();
        System.out.println("Merge Sort completed in: " + (endTime - startTime) + " ms");

        // Test Quick Sort
        startTime = System.currentTimeMillis();
        quickSort(quickArr, 0, quickArr.length - 1);
        endTime = System.currentTimeMillis();
        System.out.println("Quick Sort completed in: " + (endTime - startTime) + " ms");

        // Test Heap Sort
        startTime = System.currentTimeMillis();
        heapSort(heapArr);
        endTime = System.currentTimeMillis();
        System.out.println("Heap Sort completed in: " + (endTime - startTime) + " ms");

        // Verify all arrays are sorted correctly
        System.out.println("\nAll arrays sorted correctly: " + 
            (Arrays.equals(bubbleArr, selectionArr) && 
             Arrays.equals(selectionArr, insertionArr) &&
             Arrays.equals(insertionArr, mergeArr) &&
             Arrays.equals(mergeArr, quickArr) &&
             Arrays.equals(quickArr, heapArr)));
    }

    // 1. Bubble Sort - O(n²)
    public static int[] bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    // 2. Selection Sort - O(n²)
    public static int[] selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
        return arr;
    }

    // 3. Insertion Sort - O(n²)
    public static int[] insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    // 4. Merge Sort - O(n log n)
    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            
            merge(arr, left, middle, right);
        }
    }

    private static void merge(int arr[], int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // 5. Quick Sort - O(n log n) average, O(n²) worst case
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    // 6. Heap Sort - O(n log n)
    public static void heapSort(int arr[]) {
        int n = arr.length;

        // Build heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    // Helper method to swap elements
    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // File reading method (unchanged)
    public static int[] readArrayFromFile(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            ArrayList<Integer> numbers = new ArrayList<>();
            
            scanner.useDelimiter(",\\s*");
            
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            
            int[] arr = new int[numbers.size()];
            for (int i = 0; i < numbers.size(); i++) {
                arr[i] = numbers.get(i);
            }
            
            return arr;
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            return null;
        }
    }
}