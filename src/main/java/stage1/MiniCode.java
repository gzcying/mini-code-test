package stage1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * @author chengzi
 * 2019/11/25
 */
public class MiniCode {
    public final static String[] MAPPING = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static String letterCombinations(Integer[] inputArr) {
        if (inputArr.length == 0) {
            return "";
        }

        inputArr=filterIsBlankInMappingArr(inputArr);

        LinkedList<String> res = new LinkedList();
        res.add("");
        for (int i = 0; i < inputArr.length ; i++) {
            int index = inputArr[i];
            while (res.peekFirst().length() == i) {
                String temp = res.removeFirst();
                String s = MAPPING[index];
                for (char c : s.toCharArray()) {
                    res.add(temp + c);
                }
            }
        }
        return res.stream().collect(Collectors.joining(" "));
    }

    //过滤在映射的数组中是空字符串的下标
    private static Integer[] filterIsBlankInMappingArr(Integer[] inputArr) {
        return Arrays.stream(inputArr).filter(i -> !MAPPING[i].equals(""))
                .toArray(Integer[]::new);
    }
}
