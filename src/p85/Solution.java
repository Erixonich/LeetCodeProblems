package p85;

import java.util.Arrays;

public class Solution {
    public int maximalRectangle(char[][] matrix) {
        int cur_w = 0;
        int square = 0;
        int max_square = 0;

        char line[];

        for (int i = 0; i < matrix.length; i++) {
            line = Arrays.copyOf(matrix[i],matrix[i].length);
            cur_w = getMaxWidthFromLine(line);
            square = cur_w;
            max_square = (square > max_square) ? square : max_square;
            for (int j = i + 1; j < matrix.length; j++) {
                for (int k = 0; k < line.length; k++) {
                    line[k] = (line[k] == '1' && matrix[j][k] == '1') ? '1':'0';
                }
                cur_w = getMaxWidthFromLine(line);
                square = cur_w * (j - i + 1);
                max_square = (square > max_square) ? square : max_square;

            }
        }

        return max_square;

    }

    public int getMaxWidthFromLine(char[] line){
        int cur = 0;
        int ret = cur;

        for (int i = 0; i < line.length; i++) {
            if(line[i] == '1') cur++;
            else {
                ret = Math.max(ret,cur);
                cur = 0;
            }
        }
        return Math.max(ret,cur);
    }
}
