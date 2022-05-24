public class App {
    public static void main(String[] args) throws Exception {
        // int N = 5;
        // int array[] = {4, 1, 3, 9, 7};
        // for (int i = 0; i < array.length; i++) {
        //     System.out.println(array[i]);
        // }
        // bubbleSort(array, N);
        // for (int i = 0; i < array.length; i++) {
        //     System.out.println(array[i]);
        // }
        int N = 9;
        int arr[] = { 2, 1, 6, 10, 4, 1, 3, 9, 7};

        quickSort(arr, 0, N-1);
        printArray(arr, N);
    }
    public static void bubbleSort(int[] array, int n) {
        int temp = 0;  
        for(int i = 0; i < n; i++){  
            for(int j = 1; j < (n-i); j++){  
                if (array[j-1] > array[j]) {  
                temp = array[j-1];  
                array[j-1] = array[j];  
                array[j] = temp;  
            }
        }
    }
    }
    public static int partition(int arr[], int low, int high) {
        int temp = 0;
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if(arr[j] <= pivot) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i +1];
        arr[i +1] = arr[high];
        arr[high] = temp;
        return (i + 1);
    }
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static void printArray(int arr[], int size)
    {
    int i;
    for (i = 0; i < size; i++) {
        System.out.println(arr[i]);
    }
        
    }
}
