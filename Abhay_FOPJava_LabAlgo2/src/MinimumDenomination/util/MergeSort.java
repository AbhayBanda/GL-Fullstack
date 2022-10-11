package MinimumDenomination.util;


public class MergeSort {

    public MergeSort() {}


    public void sort(int[] arr, int low, int high) {

        if(low >= high) return;

        int mid = low + (high - low)/2;

        sort(arr, low, mid);
        sort(arr, mid+1, high);
        merge(arr, low, mid, high);

        return;
    }

    public void merge(int[] arr, int low, int mid, int high) {
        int ptr1 = low, ptr2 = mid+1, index = 0;
        int[] temp = new int[high - low + 1];

        while(ptr1 <= mid && ptr2 <= high) {
            if(arr[ptr1] >= arr[ptr2])
                temp[index++] = arr[ptr1++];
            else
                temp[index++] = arr[ptr2++];
        }

        while(ptr1 <= mid && index < temp.length)
            temp[index++] = arr[ptr1++];
        while(ptr2 <= high && index < temp.length )
            temp[index++] = arr[ptr2++];

        index = low;

        for(int i = 0; i<temp.length; ++i) {

            if(index <= high)
                arr[index++] = temp[i];
        }


    }
    public void displayArray(int[] array) {
        for(int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

