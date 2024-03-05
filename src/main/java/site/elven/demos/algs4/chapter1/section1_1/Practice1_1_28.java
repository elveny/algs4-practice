package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdOut;
import site.elven.demos.utils.StdUtils;

import java.util.Arrays;

public class Practice1_1_28 {

    public static void main(String[] args) {
        int[] arr = StdUtils.getRandomIntArr(20, 10);
        StdUtils.printArr(arr);

        Arrays.sort(arr);
        StdUtils.printArr(arr);

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[j] != arr[i]){
                arr[++j] = arr[i];
            }
        }

        StdUtils.printArr(arr);


        int[] ints = Arrays.copyOf(arr, j + 1);

        StdUtils.printArr(ints);

        StdOut.println(Arrays.toString(ints));

    }

}
