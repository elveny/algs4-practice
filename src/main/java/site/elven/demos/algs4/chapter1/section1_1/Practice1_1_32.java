package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import site.elven.demos.utils.StdUtils;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice1_1_32 {

    public static void main(String[] args) throws InterruptedException {
        int len = 200;
        double seed = 10.0;
        double[] doubleArr = StdUtils.getRandomDoubleArr(len, seed);
        StdUtils.printArr(doubleArr);

//        StdOut.println("请输入一个整数：");
//        int n = StdIn.readInt();
//
//        StdOut.println("请输入两个0~"+ seed +"的小数：");
//        double l = StdIn.readDouble();
//        double r = StdIn.readDouble();

        int n = Integer.parseInt(args[0]);
        double l = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);

        StdOut.printf("%d\t%f\t%f\t\n",  n, l, r);

        double start;
        double end = l;

        Data[] dataArr = new Data[n];

        for (int i = 0; i < n; i++) {
            start = end;
            end = start + (r - l) / n;
            Data data = new Data(i, start, end);
            StdOut.println(data);
            dataArr[i] = data;
        }

        StdOut.println(Arrays.toString(dataArr));

        for (double v : doubleArr) {
            for (Data data : dataArr) {
                if (data.getStart() <= v && data.getEnd() > v) {
                    data.getData().add(v);
                    break;
                }
            }
        }

        int maxLen = 0;
        for (Data data : dataArr) {
            if(data.getData().size() > maxLen){
                maxLen = data.getData().size();
            }
            StdOut.println(data);
        }

        StdDraw.setTitle("直方图");
        StdDraw.setXscale(l, r);
        StdDraw.setYscale(0.0, maxLen + maxLen / 8.0);
        Color[] colors = new Color[]{Color.BLUE, Color.RED, Color.YELLOW};

        StdDraw.setFont(new Font("微软雅黑", Font.BOLD, 28));

        for (Data data : dataArr) {
            int id = data.getId();
            double start1 = data.getStart();
            double end1 = data.getEnd();
            int size = data.getData().size();
            double rw = (end1 - start1) / 2;
            double rh = size / 2.0;
            double x = start1 + rw;
            double y = size / 2.0;
            StdOut.printf("%d:%d\t%f\t%f\t%f\t%f\t\n", id, size, x, y, rw, rh);
            int i = id % colors.length;
            // 设置直方图的颜色：相邻直方图颜色相异
            StdDraw.setPenColor(colors[i]);
            StdDraw.filledRectangle(x, y, rw, rh);

            // 设置文本颜色：与当前直方图颜色相异
            int j = i + 1;
            if(j >= colors.length){
                j = 0;
            }
            StdDraw.setPenColor(colors[j]);
            StdDraw.text(x, size + 0.1, ""+size);

        }
    }

    private static class Data{
        private int id;
        private double start;
        private double end;
        private List<Double> data = new ArrayList<>();

        public Data(int id, double start, double end) {
            this.id = id;
            this.start = start;
            this.end = end;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getStart() {
            return start;
        }

        public void setStart(double start) {
            this.start = start;
        }

        public double getEnd() {
            return end;
        }

        public void setEnd(double end) {
            this.end = end;
        }

        public List<Double> getData() {
            return data;
        }

        public void setData(List<Double> data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "id=" + id +
                    ", start=" + start +
                    ", end=" + end +
                    ", data=" + data +
                    '}';
        }
    }

}
