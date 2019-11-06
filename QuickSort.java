import java.util.LinkedList;

public class QuickSort {
    public static void quickSortHelp(int[] arr){
        quickSort(arr,0,arr.length-1);
    }

    public static void quickSort(int[] arr,int low,int high){
        if (low < high){
            int partition = partition(arr,low,high);
            quickSort(arr, low, partition-1);
            quickSort(arr,partition+1,high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        while (low < high){
            while (arr[high] >= arr[low] && low < high){
                high--;
            }
            Swap(arr,high,low);
            while (arr[low] <= arr[high] && low < high){
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
        for (int s : arr){
            list.add(s);
            //System.out.println(s);
        }
        System.out.println(list.get(K));
        return list.get(K);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,6,5,3,4,4,1};
        findKth(arr,6,3);
    }
}
