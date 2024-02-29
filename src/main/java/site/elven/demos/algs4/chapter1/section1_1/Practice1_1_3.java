package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Practice1_1_3 {
    public static void main(String[] args) {
        StdOut.println("请输入数字（如下格式1 2 3）：");
        int[] ints = StdIn.readAllInts();
        if(ints[0] == ints[1] && ints[1] == ints[2]){
            StdOut.println("equal");
        }
        else {
            StdOut.println("not equal");
        }
    }
}
