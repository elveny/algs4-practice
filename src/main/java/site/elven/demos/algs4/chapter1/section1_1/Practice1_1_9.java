package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Practice1_1_9 {
    public static void main(String[] args) {
        StdOut.println("请输入一个正整数：");
        int n = StdIn.readInt();
        StringBuilder s = new StringBuilder();
        for (int i = n; i > 0; i /= 2) {
            s.insert(0, (i % 2));
        }
        StdOut.printf("1.正整数%d的二进制表示为%s\n", n, s.toString());
        StdOut.printf("2.正整数%d的二进制表示为%s（用Integer.toBinaryString转换）\n", n, Integer.toBinaryString(n));
    }
}
