package base;

import java.util.HashMap;
import java.util.Map;

public abstract class SolutionBase<Output, Input> {
    protected Map<Input, Output> testCases = new HashMap<>();

    protected abstract Output function(Input input);

    public void test() {
        testCases.forEach(
                (input, output) -> {
                    if (!function(input).equals(output)) System.out.println(input);
                }
        );
    }
}
