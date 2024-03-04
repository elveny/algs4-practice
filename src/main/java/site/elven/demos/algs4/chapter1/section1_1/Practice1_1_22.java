package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdOut;
import site.elven.demos.utils.StdUtils;

public class Practice1_1_22 {
    public static void main(String[] args) {
        int[] sortedIntArr = StdUtils.getSortedIntArr(10);
        StdUtils.printArr(sortedIntArr);
        StdOut.println(rank(5, sortedIntArr));

    }

    public static int rank(int key, int[] a){
        return rank(key, a, 0, a.length - 1, 1);
    }

    public static int rank(int key, int[] a, int lo, int hi, int level){
        StdOut.printf("%"+level+"s%d\t%d\t\n", "", lo, hi);
        if(lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if(key < a[mid]){
            return rank(key, a, lo, mid -1, ++level);
        }
        else if(key > a[mid]){
            return rank(key, a, mid + 1, hi, ++level);
        }
        else {
            return mid;
        }
    }

}
