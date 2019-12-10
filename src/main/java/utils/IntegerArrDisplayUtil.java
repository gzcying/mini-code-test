package utils;

/**
 * @author chengzi
 * 2019/12/9
 */
public class IntegerArrDisplayUtil {

    public static String displayToString(Integer[] inputArr) {
        StringBuilder builder = new StringBuilder(inputArr.length * 2 + 1);
        builder.append("{");
        for (Integer integer : inputArr) {
            builder.append(integer).append(",");
        }
        int start = builder.length() - 1;
        if (start == 1) {
            builder.append("}");
        } else {
            builder.replace(start, start + 1, "}");
        }
        return builder.toString();
    }
}
