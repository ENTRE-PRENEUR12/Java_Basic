import java.util.*;
public class Java_15_Divide_Conquer{

    // Print Array
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // Merge Sort
    public static void mergeSort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        // Kaam
        int mid = si + (ei - si)/2;
        mergeSort(arr,si,mid); //left part
        mergeSort(arr,mid+1,ei); // right part
        merge(arr, si, mid, ei);

    }

    // For merge 
    public static void merge(int arr[], int si, int mid, int ei){
        // left(0,3)=4 , right(4,6)=3 : ei-si+1
        int temp[] = new int [ei-si+1];
        int i = si; // itterator for left part
        int j = mid+1; // itterator for right part
        int k = 0; // itterator for temp arr

        while(i <= mid && j<= ei){
            if(arr[i]< arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left part
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        // right part
        while(j<= ei){
            temp[k++] = arr[j++];
        }

        // copy temp to original arr
        for(k=0, i=si; k<temp.length;k++, i++){
            arr[i] = temp[k];
        }
    }

    // Quick Sort - Pivot & Partition
    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        // Pivot - last element
        int pIx = parition(arr, si, ei);
        quickSort(arr, si, pIx - 1); // left
        quickSort(arr, pIx+1, ei); // right


    }
    public static int parition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si -1; // to make plaace for else smaller than pivot

        for(int j=si;j<ei;j++){
            if(arr[j] <= pivot){
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    // Search in Rotated Sorted Array
    public static int search(int arr2[], int tar, int si, int ei){
        if(si > ei){
            return -1;
        }

        // kaam
        int mid = si + (ei-si)/2;

        // case found
        if(arr2[mid] == tar){
            return mid;
        }

        // mid on l1
        if(arr2[si] <= arr2[mid]){
            // case a :left
            if(arr2[si] <= tar && tar <= arr2[mid]){
                return search(arr2, tar, si, mid);
            }else{
                // case b: right
                return search(arr2, tar, mid+1, ei);
            }
        }

        // mid on l2
        else{
            // case c: right
            if(arr2[mid] <= tar && tar <= arr2[ei]){
                return search(arr2, tar, mid+1, ei);
            }else{
                // case d : left
                return search(arr2, tar, si, mid-1);
            }
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {6,3,9,5,2,8};
        System.out.println("Merge Sort - Divide and Conquer");

        mergeSort(arr, 0, arr.length -1);
        printArr(arr);

        // Quick Sort - Pivot & Partition
        System.out.println("Quick Sort - Pivot & Partition");
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);

        // Search in Rotated Sorted Array
        int arr2[] = {4,5,6,7,0,1,2};
        System.out.println("Search in Rotated Sorted Array");
        int target =0; // output = 4
        int tarIdx = search(arr2, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }

}