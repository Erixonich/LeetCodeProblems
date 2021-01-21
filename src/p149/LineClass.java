package p149;

import java.util.Objects;

public class LineClass {
    double k;
    double b;

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