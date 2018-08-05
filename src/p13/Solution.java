package p13;

import java.util.*;

public class Solution {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        Map<Character,Integer> romanValues = new HashMap<>();
        romanValues.put('I',1);
        romanValues.put('V',5);
        romanValues.put('X',10);
        romanValues.put('L',50);
        romanValues.put('C',100);
        romanValues.put('D',500);
        romanValues.put('M',1000);

        int val = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1 && romanValues.get(chars[i]) < romanValues.get(chars[i+1])) {
                val += romanValues.get(chars[i+1])- romanValues.get(chars[i]);
                i++;
            } else {
                val += romanValues.get(chars[i]);
            }

        }
        return val;
    }
}