package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.concurrent.TimeUnit;

public class Practice1_1_31 {

    public static void main(String[] args) throws InterruptedException {
        StdOut.println("请输入一个整数：");
        int n = StdIn.readInt();

        StdOut.println("请输入一个0~1的小数：");
        double p = StdIn.readDouble();

        StdOut.println(n);
        StdOut.println(p);

        TimeUnit.SECONDS.sleep(5);

        StdDraw.circle(0.5,0.5,0.5);

        Point[] points = new Point[n];
        double angle = 360.0 / n;

        StdDraw.setPenRadius(0.05);

        for(int i = 0;i < n;i++){
            double x = 0.5 + 0.5 * Math.cos(angle * i * Math.PI/ 180);
            double y = 0.5 + 0.5 * Math.sin(angle * i * Math.PI/ 180);

            StdDraw.point(x, y);

            points[i] = new Point(x, y);
        }

        StdDraw.setPenRadius(0.01);
        for(int i = 0;i < n-1;i++) {
            for (int j = i + 1; j < n; j++){
                if (StdRandom.bernoulli(p)){
                    StdDraw.line(points[i].getX(), points[i].getY(), points[j].getX(), points[j].getY());
                }
            }
        }
    }

    public static class Point{
        private double x;
        private double y;

        public Point() {
        }

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    }
}
