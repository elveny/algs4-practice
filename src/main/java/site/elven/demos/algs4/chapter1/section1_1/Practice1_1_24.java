package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Practice1_1_24 {
    public static void main(String[] args) {
        int[] ints = StdIn.readAllInts();
        int gcd = gcd(ints[0], ints[1]);
        StdOut.println("gcd=" + gcd);
    }

    /**
     * 欧几里得算法（代码及证明过程）
     * 一、基础知识
     * 欧几里得算法的原理是 GCD递归定理
     *
     * GCD递归定理：
     * 对任意 非负整数 a 和 任意 整数 b，gcd(a,b) = gcd(b, a mod b)
     * 为了证明这个定理，我们首先需要知道一下几个有关 gcd 的基本知识跟相关等式跟推论
     *
     * 1.1 基本知识：
     * 公约数
     * 定义：如果 d|a（d 整除 a）且 d|b，那么 d 是 a 与 b 的 公约数。
     * 性质：如果 d|a 且 d|b，那么 d|(ax + by); x,y ∈ Z(任意整数)
     * 最大公约数
     * 定义：两个非零整数 a 和 b 的公约数里最大的就是 最大公约数。
     * 1.2 相关等式跟推论：
     * 等式 1：如果 a|b 且 b|a 那么 a = ±b
     * 等式 2：如果 d|a 且 d|b 那么 d|(ax + by); x,y ∈ Z
     * 等式 3：a mod n = a - n⌊a/n⌋(向下整除); a∈Z,n∈N*(正整数)
     * 推论 1：对任意整数 a , b，如果 d|a 且 d|b 则 d|gcd(a, b)
     * 二、证明过程
     * 如果我们想要获得结论gcd(a,b) = gcd(b, a mod b)
     *
     * 那么我们只需要证明gcd(a,b)|gcd(b, a mod b) 且 gcd(b,a mod b)|gcd(a,b)就可以利用等式 1来证明他俩相等了。
     *
     * 2.1 证明 gcd(a,b)|gcd(b,a mod b)
     * 设 d = gcd(a, b)
     * ∴ d|a 且 d|b
     * ∵ 由 等式 3 可知：(a mod b) = a - qb q = ⌊a/b⌋
     * ∴ a mod b 是 a 与 b 的线性组合
     * ∴ 由 等式 2 可知 ：d|(a mod b)
     * ∵ d|b 且 d|(a mod b)
     * ∴ 由 推论 1 可知 d|gcd(b, a mod b)
     * 等价结论： gcd(a, b)|gcd(b, a mod b)
     * 2.2 证明 gcd(b,a mod b)|gcd(a,b)
     * 设 c = gcd(b, a mod b)
     * ∴ c|b 且 c|(a mod b)
     * ∵ a = qb + r
     *  r = a mod b
     *  q = ⌊a/b⌋
     * ∴ a 是 b 和 (a mod b) 的线性组合
     * ∴ 由 等式 2 可知：c|a
     * ∵ c|a 且 c|b
     * ∴ 由 推论 1 可知：c|gcd(a, b)
     * 等价结论： gcd(b, a mod b)|gcd(a, b)s
     * 2.3 证明 gcd(a,b) = gcd(b, a mod b)
     * 由 上述两个结论 可知：
     * gcd(a, b)|gcd(b, a mod b)
     * gcd(b, a mod b)|gcd(a, b)
     * ∴ 由 等式 1 可知：
     *  gcd(a, b) = gcd(b, a mod b)
     * 到这里 GCD递归定理 就证明结束了
     * @param p
     * @param q
     * @return
     */
    public static int gcd(int p, int q){
        if(q == 0) return p;
        int r = p % q;
        StdOut.printf("%d\t%d\t%d\t\n", p, q, r);
        return gcd(q, r);
    }
}
