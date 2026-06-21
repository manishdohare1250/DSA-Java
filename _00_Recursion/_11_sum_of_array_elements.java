
public class _11_sum_of_array_elements {

    public static int findSum(int[] arr, int index) {

        if (index == arr.length) {
            return 0;
        }

        return arr[index] + findSum(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };

        int sum = findSum(arr, 0);

        System.out.println("Sum = " + sum);
    }
}
