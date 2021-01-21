package p149;

import base.SolutionBase;

import java.util.*;

public class Solution extends SolutionBase<Integer, Solution.Input> {

    public int maxPoints(int[][] points) {
        Map<LineClass, Integer> lines = new HashMap<>();
        int max = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                LineClass line = new LineClass(points[i][0], points[i][1], points[j][0], points[j][1]);
                Integer x = lines.getOrDefault(line, 2);
                x++;
                max = Math.max(max, x);
                lines.put(line, x);
            }
        }
        return max;
    }

    @Override
    protected Integer function(Input input) {
        return null;
    }

    public static class Input {
        int[][] x;
    }

}

