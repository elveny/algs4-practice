package site.elven.demos.algs4.chapter1.section1_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

public class Practice1_1_std_draw {

    public static void main(String[] args) throws InterruptedException {
        StdDraw.setTitle("画布");
        StdDraw.setCanvasSize(512, 512);
        StdDraw.setXscale(0.0, 1.0);
        StdDraw.setYscale(0.0, 1.0);

        StdDraw.setPenColor(Color.BLUE);

        StdDraw.setPenRadius(0.01);
        StdDraw.line(0.0, 0.0, 1.0, 1.0);

        StdDraw.setPenRadius(0.05);
        StdDraw.point(0.1, 0.1);

        StdDraw.setFont(new Font("微软雅黑", Font.BOLD, 28));
        StdDraw.text(0.2, 0.2, "一段文字");

        StdDraw.setPenRadius(0.01);
        StdDraw.circle(0.3, 0.3, 0.05);

        StdDraw.filledCircle(0.4, 0.4, 0.05);

        StdDraw.ellipse(0.5, 0.5, 0.05, 0.02);
        StdDraw.filledEllipse(0.6, 0.6, 0.05, 0.02);

        StdDraw.square(0.1, 0.9, 0.05);
        StdDraw.filledSquare(0.2, 0.8, 0.05);

        StdDraw.rectangle(0.3, 0.7, 0.04, 0.02);
        StdDraw.filledRectangle(0.4, 0.6, 0.04, 0.02);

        double[] x = new double[]{
                StdRandom.uniformDouble(0.5, 1.0),
                StdRandom.uniformDouble(0.5, 1.0),
                StdRandom.uniformDouble(0.5, 1.0),
                StdRandom.uniformDouble(0.5, 1.0),
                StdRandom.uniformDouble(0.5, 1.0)
        };

        double[] y = new double[]{
                StdRandom.uniformDouble(0.0, 0.5),
                StdRandom.uniformDouble(0.0, 0.5),
                StdRandom.uniformDouble(0.0, 0.5),
                StdRandom.uniformDouble(0.0, 0.5),
                StdRandom.uniformDouble(0.0, 0.5)
        };
        StdDraw.polygon(x, y);


        double[] x1 = new double[]{
                StdRandom.uniformDouble(0.3, 0.7),
                StdRandom.uniformDouble(0.3, 0.7),
                StdRandom.uniformDouble(0.3, 0.7),
                StdRandom.uniformDouble(0.3, 0.7),
                StdRandom.uniformDouble(0.3, 0.7)
        };

        double[] y1 = new double[]{
                StdRandom.uniformDouble(0.5, 0.9),
                StdRandom.uniformDouble(0.5, 0.9),
                StdRandom.uniformDouble(0.5, 0.9),
                StdRandom.uniformDouble(0.5, 0.9),
                StdRandom.uniformDouble(0.5, 0.9)
        };
        StdDraw.filledPolygon(x1, y1);

    }

}
