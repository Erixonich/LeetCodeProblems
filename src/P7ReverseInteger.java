/**
 * Created by Erixon on 05.06.2017.
 */
public class P7ReverseInteger {
    public int reverse(int x) {
        Integer y = Math.abs(x);

        long ret = 0;
        char[] ch = y.toString().toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            ret += (ch[i] - '0') * Math.pow(10, i);
        }
        if (x < 0) ret *= -1;
        if (ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE) ret = 0;
        return (int) ret;
    }
}
