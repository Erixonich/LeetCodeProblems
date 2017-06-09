import java.util.HashSet;

/**
 * Created by Erixon on 02.02.2017.
 */
public class P5longestPalindrome {
    public String  longestPalindrome(String s) {
        int[] r_Cur = {0,0};
        boolean flag;
        char[] ch = s.toCharArray();
        int ln = ch.length;
        for (int i = 0; i < ln; i++) {
            for (int j = i+1; j < ln; j++) {
                int k = 0;
                flag = true;
                while((i+k) < (j-k)){
                    if (ch[i+k] != ch[j-k]){
                        flag = false;
                        break;
                    }
                    k++;
                }
                if (flag && (j-i) > (r_Cur[1] - r_Cur[0])) {
                    r_Cur[0] = i;
                    r_Cur[1] = j;
                }
            }
        }

        return s.substring(r_Cur[0], r_Cur[1]+1);
    }

}
