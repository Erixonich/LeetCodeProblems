package p149;

import java.util.*;

@Deprecated
public class SolutionWrong {

    public int maxPoints(int[][] points) {
        Map<LineClass, Set<Point>> lines = new HashMap<>();
//        if (points.length == 1) return 1;
        int max_cnt = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i; j < points.length; j++) {
                Point a = new Point(points[i][0], points[i][1]);
                Point b = new Point(points[j][0], points[j][1]);
                LineClass lineClass = new LineClass(a, b);
                Set<Point> pts = lines.getOrDefault(lineClass, new HashSet<>());
                pts.add(a);
                pts.add(b);
                lines.putIfAbsent(lineClass, pts);
            }
        }

        for (Map.Entry<LineClass, Set<Point>> entry : lines.entrySet()) {
            if (entry.getValue().size() > max_cnt) {
                max_cnt = entry.getValue().size();
            }
        }
        return max_cnt;
    }

    public static class LineClass {
        double k;
        double b;

        public LineClass(Point p, Point q) {
            this(p.x, p.y, q.x, q.y);
        }

        public LineClass(int a_x, int a_y, int b_x, int b_y) {
            if (a_x != b_x) {
                this.k = ((double) (a_y - b_y))/(a_x - b_x);
                this.b = a_y - this.k * a_x;
            }
            else {
                this.k = Double.MAX_VALUE;
                this.b = a_x;
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            LineClass lineClass = (LineClass) o;
            return k == lineClass.k &&
                    b == lineClass.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(k, b);
        }

        @Override
        public String toString() {
            return "{" + k + "," + b + "}";
        }
    }

    public static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x &&
                    y == point.y;
        }

        @Override
        public int hashCode() {
            return  x ^ (y * 31);
        }
    }
}
