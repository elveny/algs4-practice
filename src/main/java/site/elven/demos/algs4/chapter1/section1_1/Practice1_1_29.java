package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdOut;
import site.elven.demos.utils.StdUtils;

import java.util.Arrays;

public class Practice1_1_29 {

    public static void main(String[] args) {
//        int[] arr = new int[]{3,4,2,7,9,3,5,3,1};
        int[] arr = StdUtils.getRandomIntArr(20, 10);
        int key = 6;
        Arrays.sort(arr);
        StdOut.println(Arrays.toString(arr));
        int rank = rank(key, arr, 0);
        StdOut.println(rank);

        int count = count(key, arr);
        StdOut.println(count);
    }

    public static int rank(int key, int[] arr, int n){
        int i = indexOf(arr, key);
        if(i == -1){
            return n;
        }

        return rank(key, Arrays.copyOf(arr, i), i);
    }

    public static int count(int key, int[] arr){
        int i = indexOf(arr, key);
        if(i == -1){
            return 0;
        }

        int[] lo = Arrays.copyOfRange(arr, 0, i);
        int[] hi = Arrays.copyOfRange(arr, i+1, arr.length);

        return 1 + count(key, lo) + count(key, hi);

    }


    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

}
