package stage2;

/**
 * @author chengzi
 * 2019/11/25
 */
public class MappingFactory {

    public static String[] getMappingArray(int limit) {
        if (limit <= 9) {
            return get9Arr();
        } else if (limit <= 99) {
            return get99Arr();
        } else {
            return new String[0];
        }
    }

    public static String[] get9Arr() {
        return new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    }

    public static String[] get99Arr() {
        return new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz",
                "", "", "11", "12", "13", "14", "15", "16", "17", "18"
                //省略后续
        };
    }
}
