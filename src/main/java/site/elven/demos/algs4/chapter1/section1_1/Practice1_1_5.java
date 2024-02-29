package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Practice1_1_5 {
    public static void main(String[] args) {
        StdOut.println("请输入数字（如下格式1 2）：");
        double[] in = StdIn.readAllDoubles();
        double x = in[0];
        double y = in[1];
        StdOut.printf("x=%f, y=%f %n", x, y);
        if(x >= 0 && x <= 1
                && y >= 0 && y <= 1){
            StdOut.println("true");
        }
        else {
            StdOut.println("false");
        }
    }
}
