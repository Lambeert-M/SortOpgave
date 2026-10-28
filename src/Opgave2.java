import java.util.Arrays;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Objects;

public class Opgave2 {
    public static void run() {

        getNewAction();
    }

    public static void getNewAction() {
        System.out.println("What do you want to do?");
        System.out.println("1 : Do insertion sort");
        System.out.println("2 : Do quicksort");
        System.out.println("3 : Quit");
        int action = Utils.reader(1, 3);

        switch (action) {
            case 1:
                insertionSort();
                getNewAction();
                break;
            case 2:
                quickSort();
                binarySearch("Piratfisk");
                getNewAction();
                break;
            case 3:
                System.exit(0);
        }
    }

    public static void insertionSort(){
        int[] data = {4, 8, 6, 2, 3, 9, 7, 5};
        System.out.println("Given array:");
        System.out.println(Arrays.toString(data));

        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] < key) {
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = key;
        }
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(data));
    }

    public static String[] animalArr;
    public static void quickSort() {
        try {
            animalArr = Files.readAllLines(Paths.get("src/arter.txt")).toArray(String[]::new);
            System.out.println("Given array:");
            System.out.println(Arrays.toString(animalArr));

            quickSort(animalArr, 0, animalArr.length - 1);

            System.out.println("Sorted array:");
            System.out.println(Arrays.toString(animalArr));

        } catch (IOException e) {
            System.out.println("Could not read file: " + e.getMessage());
        }
    }

    static void quickSort(String[] arr, int low, int high) {
        if (low < high) {

            // pi is the partition return index of pivot
            int pi = partition(arr, low, high);

            // recursion calls for smaller elements
            // and greater or equals elements
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(String[] arr, int low, int high)
    {
        // choose the pivot
        String pivot = arr[high];

        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void binarySearch(String searchTarget) {
        int low = 0, high = animalArr.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;

            //  If mid == target
            if (animalArr[mid].compareTo(searchTarget) == 0) {
                System.out.println(searchTarget + "found at index: " + mid);
            }

            // If less than target
            if (animalArr[mid].compareTo(searchTarget) < 0) {
                low = mid + 1;
            }

            // If greater than target
            else {
                high = mid - 1;
            }
        }
    }
}
