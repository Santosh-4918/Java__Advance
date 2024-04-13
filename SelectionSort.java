public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // for ascending order
                if (arr[j] < arr[i]) {
                    // minIndex = j;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            // Swap arr[i] and arr[minIndex]
            // int temp = arr[i];
            // arr[i] = arr[minIndex];
            // arr[minIndex] = temp;

        }

    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println(" Original array: ");
        for (int i : arr) {
            System.out.println(i + " ");
        }
        selectionSort(arr);
        System.out.println(" Sorted Array are: ");
        for (int i : arr) {
            System.out.println(i + " ");

        }

    }

}
