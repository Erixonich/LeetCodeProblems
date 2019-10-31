package p65;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private Map<String, Boolean> tests = new HashMap<>();

    public Solution() {
        tests.put("0", true);
        tests.put("0.1.", false);
        tests.put("1e1", true);
        tests.put("e", false);
        tests.put(".1", true);
        tests.put("3.", true);
        tests.put(".", false);
        tests.put(" ", false);
        tests.put("0e", false);
        tests.put(" -.", false);
        tests.put("7e69e", false);
        tests.put("-e58 ", false);
    }

    public void test(){
        tests.forEach((s, b) -> {
            if (b ^ this.isNumber(s)) System.out.println(s);
        });
    }

    public boolean isNumber(String s) {
        boolean hasE = s.contains("e");
        String trimmed = s.trim();

        if (!trimmed.isEmpty() && trimmed.charAt(trimmed.length() -1) == 'e') return false;

        String[] strings = trimmed.split("e");
        if (strings.length > 2 || strings.length == 0) return false;
        if (strings.length == 1 && hasE) return false;
        boolean valid = true;

        if (strings[0].matches("[-+]?\\.?") || strings[0].equals("")) return false;
        if (!strings[0].matches("[-+]?[0-9]*\\.?[0-9]*")) valid = false;
        if (valid && strings.length == 2){
            if (strings[1].equals("")) return false;
            if (!strings[1].matches("[-+]?[0-9]+")) valid = false;
        }



        return valid;
    }
}
