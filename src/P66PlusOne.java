/**
 * Created by Erixon on 05.06.2017.
 */
public class P66PlusOne {
    public int[] plusOne(int[] digits) {

        byte a = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += a;
            a = 0;
            if (digits[i] > 9) {
                digits[i] = 0;
                a = 1;
            }
        }
        if (a > 0){
            int[] ret = new int[digits.length + 1];
            ret[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                ret[i+1] = digits[i];
            }
            return ret;
        }
        return digits;
    }
}
