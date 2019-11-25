package stage1;

import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * @author chengzi
 * 2019/11/25
 */
public class MiniCode {
    public final static String[] MAPPING = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static String letterCombinations(int[] inputArr) {
        if (inputArr.length == 0) {
            return "";
        }

        LinkedList<String> res = new LinkedList();
        res.add("");
        for (int i = 0; i < inputArr.length ; i++) {
            int index = inputArr[i];
            while (res.peekFirst().length() == i) {
                String temp = res.removeFirst();
                for (char c : MAPPING[index].toCharArray()) {
                    res.add(temp + c);
                }
            }
        }
        return res.stream().collect(Collectors.joining(" "));
    }
}
