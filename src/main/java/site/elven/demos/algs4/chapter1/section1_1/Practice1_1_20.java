package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdOut;

public class Practice1_1_20 {
    public static void main(String[] args) {
        StdOut.println(f(5));
        StdOut.println(factorial(5));
        StdOut.println(Math.log(factorial(5)));
        StdOut.println(Math.log(0));
        StdOut.println(Math.log(1));
    }

    /**
     * 题目：编写一个递归的静态方法计算ln(N!)的值。
     *
     * 【背景知识】
     * - ln是数学中的对数符号。
     * 数学领域自然对数用ln表示
     * ln 即自然对数 ln=loge(a)。
     * 以e为底数的对数通常用于ln，而且e还是一个超越数。
     * - N!是N的阶乘- 对数的运算法则：两个正数的积的对数，等于同一底数的这两个数的对数的和，即 loga(M*N) = loga(M) + loga(N)
     *
     * 题目中我们使用归纳法来解决问题令f(N)= ln(N!)
     * f(1) = ln(1!) = 0
     * f(2) = ln(2!) = ln(2 * 1) = ln2 + ln1 = ln2 + f(3)
     * f(3) = ln(3!) = ln(3 * 2 * 1) = ln3 + ln2 + ln1 = ln3 + f(2)
     * f(4) = ln(4!) = ln(4 * 3 * 2 * 1) = ln4 + ln3 + ln2 + ln1 = ln4 + f(3)
     * f(5) = ln(5!) = ln(5 * 4 * 3 * 2 * 1) = ln5 + ln4 + ln3 + ln2 + ln1 = ln5 + f(4)
     *
     * ...
     * f(n) = f(n-1) +lnn
     * @param n
     * @return
     */
    public static double f(int n){
        if(n == 0) return 0.0;
        if(n == 1) return 0.0;
        return Math.log(n) + f(n-1);
    }

    public static int factorial(int n){
        if(n == 0) return 1;
        if(n == 1) return 1;
        return n * factorial(n-1);
    }

}
