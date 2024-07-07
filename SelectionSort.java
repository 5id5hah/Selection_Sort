import java.util.Arrays;

import static java.util.Collections.swap;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,6,1,8,2,3,10,11,-122,0};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - i -1;
        int maxindex = getmaxindex(arr, 0, last);
            swap(arr, maxindex,last );
        }


    }

    public static int getmaxindex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if ( arr[max] < arr[i]){
              max = i;

            }
        } return max;
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }



    }

