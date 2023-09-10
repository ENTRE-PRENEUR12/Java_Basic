import java.util.*;

public class Java_9_Sorting {
    // Bubble Sort
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swaps = 0;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            System.out.println("Swaps " + swaps);
        }
    }

    // print array
    public static void arrPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Selection Sort
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            int minVal = Integer.MAX_VALUE;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            // Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Selction Sort = ");
    }

    // Insertion Sort
    public static void Insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            // finding position to insert
            while(prev >=0 && arr[prev]>curr){
                arr[prev +1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
    } 

    // Counting Sort
    public static void counting(int arr[]){
        int larg = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            larg = Math.max(larg, arr[i]);
        }
        int count[] = new int[larg+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        // sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] =i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Bubble Sort
        System.out.println("Bubble Sort");
        int arr[] = { 1,4,1,3,2,4,3,7 };
        bubbleSort(arr);
        arrPrint(arr);

        // Selection Sort
        System.out.println("Selection Sort");
        selectionSort(arr);
        arrPrint(arr);

        // Insertion Sort
        System.out.println("Insertion Sort");
        Insertion(arr);
        arrPrint(arr);

        // Inbuilt Arrays
        System.out.println("Inbuilt Arrays");
        Arrays.sort(arr);
        arrPrint(arr);
        Arrays.sort(arr,0,1);
        arrPrint(arr);

        // Integer arr2[] = {5,2,3,1,6,4};
        // Arrays.sort(arr2,0,2,Collections.reverseOrder());
        // arrPrint(arr2);

        // Counting Sort
        System.out.println("Counting Sort");
        counting(arr);
        arrPrint(arr);

    }
}
