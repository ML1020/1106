//求第K大的数
import java.util.LinkedList;
import java.util.Scanner;

public class Finder {
    public static void quickSortHelp(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        while (low < high) {
            while (arr[high] >= arr[low] && low < high) {
                high--;
            }
            Swap(arr, high, low);
            while (arr[low] <= arr[high] && low < high) {
                low++;
            }
            Swap(arr, high, low);
        }
        return low;
    }

    private static void Swap(int[] arr, int high, int low) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }

    public static int findKth(int[] arr, int n, int K) {
        //n为字长，K为第几大的数
        quickSortHelp(arr);
        LinkedList<Integer> list = new LinkedList();
        for (int s : arr) {
            list.add(s);
            //System.out.println(s);
        }
        System.out.println(list.get(n-K));
        return list.get(n - K);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int K = scanner.nextInt();
        findKth(arr, n, K);
    }
}
