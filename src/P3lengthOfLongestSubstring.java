/**
 * Created by Erixon on 26.01.2017.
 */
public class P3lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int beginCh = 0;
        int ln = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(chars[i],beginCh) < i) {
                System.out.println("!");
                if (ln < i  - beginCh) ln = i - beginCh;
                beginCh = s.indexOf(chars[i],beginCh) + 1;
            }
            System.out.print("i = " + i + " ");
            System.out.print("beginCh = " + beginCh + " ");
            System.out.print(s.substring(beginCh,i+1) + " ");
            System.out.print("ln = " + ln + " ");
            System.out.print('\n');


        }
        if (ln < s.length() - beginCh ) ln = s.length() - beginCh;
        return ln;
    }
}
