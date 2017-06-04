/**
 * Created by Erixon on 25.03.2017.
 */
public class P27RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int num;
        int y = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                num = nums[i];
                for (int j = y; j > i; j--) {
                    if (nums[j] != val){
                        nums[i] = nums[j];
                        nums[j] = num;
                        //Main.printArr(nums);
                        y--;

                        break;
                    }
                }
            }
        }
        return y;
    }
}
