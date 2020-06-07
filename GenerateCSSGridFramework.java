import java.util.ArrayList;
import java.util.List;

public class GenerateCSSGridFramework {
    public static void main(String[] args) {
        List<String> rules = new ArrayList<>();
        int numColumns = 12;
        for (int i = 1; i <= numColumns; i++) {
            for (int j = 1; j <= numColumns; j++) {
                if (j >= i) {
                    String cssRule;
                    if (j == numColumns) {
                        cssRule = String.format(".col-%d-%d { grid-column: %d/ -1; grid-row: 1; }", i, j, i);
                    } else {
                        cssRule = String.format(".col-%d-%d { grid-column: %d/ %d; grid-row: 1; }", i, j, i, j + 1);
                    }
                    rules.add(cssRule);
                }
            }
        }
        String css = String.join("", rules);
        System.out.println(css);
    }
}