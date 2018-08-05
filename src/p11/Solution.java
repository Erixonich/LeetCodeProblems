package p11;

public class Solution {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int curArea;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                curArea = (j-i) * Math.min(height[i],height[j]);
                if (curArea > maxArea) maxArea = curArea;
            }
        }
        return maxArea;
    }
}
