package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice1_1_19 {
    public static void main(String[] args) {
        StdOut.println(fibonacci(10));

        int one_minute = 60 * 1000;
        int ten_minutes = 10 * one_minute;
        int one_hour = 6 * ten_minutes;

        StdOut.println(run(one_hour));
    }

    public static long fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static List<Map<Integer, Long>> run(long timeout){
        long start = System.currentTimeMillis();
        List<Map<Integer, Long>> result = new ArrayList<>(1024);
        int n = 0;
        long end = System.currentTimeMillis();
        while (end - start < timeout){
            Map<Integer, Long> map = new HashMap<>();
            long value = fibonacci(n);
            map.put(n, value);
            result.add(map);
            StdOut.printf("time: %d(s), n=%d, value=%d\n", (end-start)/1000, n, value);
            end = System.currentTimeMillis();
            n++;
        }
        return result;
    }
}
