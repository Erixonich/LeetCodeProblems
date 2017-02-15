/**
 * Created by Erixon on 02.02.2017.
 */
public class P5longestPalindrome {
    public String longestPalindrome(String s){
        char[] chars = s.toCharArray();
        
        StringBuffer stringCurrent = new StringBuffer();
        StringBuffer stringReserve = new StringBuffer();
        boolean flag;

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == chars[chars.length - 1 - j + i]){
                    //stringCurrent.insert(chars[j]);
                    flag = true;
                }
                else flag = false;
                if (!flag){
                    stringReserve.append(stringCurrent);
                    stringCurrent.delete(0, stringCurrent.length());
                }
            }
        }
        return stringCurrent.toString();
    }
}
