/**
 * Created by Erixon on 05.06.2017.
 */
public class P8StringtoInteger_atoi {
    public int myAtoi(String str) {
        if (str.length() == 0) return 0;
        long ret = 0;
        char[] ch = str.toCharArray();
        boolean pos = true;
        boolean started = false;
        int k = 0;

        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == ' ' && !started) continue;
            if (ch[i] == '-') {
                pos = false;
                started = true;
                k++;
                continue;
            }
            if (ch[i] == '+') {
                pos = true;
                started = true;
                k++;
                continue;
            }
            if(ch[i]<'0' || ch[i]>'9'||k>1) {
                ret = ret/(long)(Math.pow(10,ch.length - i));
                break;
            }
            started = true;
            ret += (ch[i] - '0') * Math.pow(10, ch.length - i - 1);
        }
        ret *= (pos?1:-1);
        if (ret < Integer.MIN_VALUE) ret = Integer.MIN_VALUE;
        if (ret > Integer.MAX_VALUE) ret = Integer.MAX_VALUE;
    return (int) ret;
    }
}
