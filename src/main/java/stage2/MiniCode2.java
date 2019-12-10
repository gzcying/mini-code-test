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

    public String letterCombinations(Integer[] inputArr) {
        if (inputArr.length == 0) {
            return "";
        }
        if (this.isIndexOutOfBounds(inputArr)) {
            throw new IndexOutOfBoundsException("inde of inputArray is out of bounds");
        }
        inputArr = filterIsBlankInMappingArr(inputArr);

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

    /**
     * 判断是否超出界面
     * @param inputArr
     * @return
     */
    private boolean isIndexOutOfBounds(Integer[] inputArr){
        int length = this.mapping.length;
         return Arrays.stream(inputArr).anyMatch(i -> i >= length);
    }

    //过滤在映射的数组中是空字符串的下标
    private  Integer[] filterIsBlankInMappingArr(Integer[] inputArr) {
        return Arrays.stream(inputArr).filter(i -> !mapping[i].equals(""))
                .toArray(Integer[]::new);
    }
}
