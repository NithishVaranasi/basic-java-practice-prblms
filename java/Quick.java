import java.util.Scanner;
class Quick {
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot, swap it with the element at index i+1
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        // Return the pivot index
        return i + 1;
    }
    // Recursive method to perform quick sort
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(array, low, high);
            // Recursively call quickSort on the two subarrays
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }
    // Method to print the array
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) 
		{
            array[i] = scanner.nextInt();
        }
        System.out.println("Original Array:");
        printArray(array);
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted Array:");
        printArray(array);
        scanner.close();
    }
}