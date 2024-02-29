package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdOut;

public class Practice1_1_7 {
    public static void main(String[] args) {
        {
            StdOut.println("--------------------");

            double t = 9.0;
            while (Math.abs(t - 9.0/t) > .001){
                t = (9.0/t + t) / 2.0;
                StdOut.println(t);
            }
            StdOut.printf("final: t = %.5f\n", t);
        }

        {
            StdOut.println("--------------------");

            int sum = 0;
            for (int i = 1; i < 1000; i++)
                for(int j = 0; j < i; j++)
                    sum++;
            StdOut.println(sum);
        }

        {
            StdOut.println("--------------------");

            int sum = 0;
            for (int i = 1; i < 1000; i++)
                sum += i;
            StdOut.println(sum);
        }

        {
            StdOut.println("--------------------");

            int sum = 0;
            // i 取值：1 2 4 8 16 32 64 128 256 512
            for (int i = 1; i < 1000; i *= 2)
                for(int j = 0; j < 1000; j++)
                    sum++;
            StdOut.println(sum);
        }

    }
}
