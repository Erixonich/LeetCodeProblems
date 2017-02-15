/**
 * Created by Erixon on 26.01.2017.
 */
public class P463IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int elemCnt = 0;
        int borderCnt = 0;
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == 1) {
                    if (i > 0 && grid[i-1][j] == 1) borderCnt++; //check upper border
                    //if (i+1 < grid.length && grid[i+1][j] == 1) borderCnt++; //check lower border
                    if (j > 0 && grid[i][j-1] == 1) borderCnt++; //check left border
                    //if (j+1 < grid[0].length && grid[i][j+1] == 1) borderCnt++; //check right border
                    elemCnt++;
                }
                System.out.print(grid[i][j]);
            }
            System.out.println();

        }
        System.out.println("borderCnt = " + borderCnt);
        System.out.println("elemCnt = " + elemCnt);
        return elemCnt*4 - borderCnt*2;
    }
}
