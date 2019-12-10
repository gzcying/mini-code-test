import org.junit.Test;
import stage1.MiniCode;
import utils.IntegerArrDisplayUtil;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author chengzi
 * 2019/11/25
 */
public class Stage1Test {

    /**
     * 以手动输入的方式测试
     * @param args
     */
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("请选择：1继续，0退出");
            int read = new Scanner(System.in).nextInt();
            if (read == 0) {
                return;
            }
            System.out.println("请输入数字序列，以英文逗号分隔：");
            String line = getInputWithVerify();
            Integer[] inputArr = Arrays.stream(line.split(","))
                    .filter(s -> !s.equals(""))
                    .map(s -> Integer.parseInt(s))
                    .toArray(Integer[]::new);
            String result = MiniCode.letterCombinations(inputArr);
            System.out.println(result);
        }
    }

    private static String getInputWithVerify() {
        for (; ; ) {
            String line = new Scanner(System.in).nextLine();
            if (!line.matches("(\\d,?)+")) {
                System.out.println("输入不合法，请重新输入：");
                continue;
            }
            return line;
        }
    }


    @Test
    public void test() {
        Integer[] inputArr = {2, 4};
        System.out.println("输入为：" + IntegerArrDisplayUtil.displayToString(inputArr));
        String result = MiniCode.letterCombinations(inputArr);
        System.out.println("输出为：" + result);
    }

}
