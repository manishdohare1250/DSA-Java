package _03_Array;

public class Binary_search {

    public static void main(String[] args) {

        int[] arr = { 20, 40, 50, 60, 50, 80 };
        int key = 60;

        int result = searchElement(arr, key);

        if (result != -1) {
            System.out.print("Element found at index no.: " + result);
        } else {
            System.out.print("Element not  found at  any index no.");

        }
    }

    public static int searchElement(int[] arr1, int key1) {
        int low = 0;
        int high = arr1.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr1[mid] == key1) {
                return mid;
            } else if (key1 < arr1[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
