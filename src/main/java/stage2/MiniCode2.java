package stage2;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * @author chengzi
 * 2019/11/25
 */
public class MiniCode2 {

    private String[] mapping;

    public MiniCode2(@NotNull String[] mapping) {
        this.mapping = mapping;
    }

    public String letterCombinations(int[] inputArr) {
        if (inputArr.length == 0) {
            return "";
        }
        if (this.isIndexOutOfBounds(inputArr)) {
            throw new IndexOutOfBoundsException("inde of inputArray is out of bounds");
        }
        LinkedList<String> res = new LinkedList();
        res.add("");
        for (int i = 0; i < inputArr.length; i++) {
            int index = inputArr[i];
            while (res.peekFirst().length() == i) {
                String temp = res.removeFirst();
                for (char c : mapping[index].toCharArray()) {
                    res.add(temp + c);
                }
            }
        }
        return res.stream().collect(Collectors.joining(" "));
    }

    private boolean isIndexOutOfBounds(int[] inputArr){
        int length = this.mapping.length;
         return Arrays.stream(inputArr).anyMatch(i -> i >= length);
    }
}
