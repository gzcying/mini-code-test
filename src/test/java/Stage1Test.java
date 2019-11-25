import org.junit.Test;
import stage1.MiniCode;

/**
 * @author chengzi
 * 2019/11/25
 */
public class Stage1Test {

    @Test
    public void testInput2And3() {
        int[] inputArr = {2, 3};
        String result = MiniCode.letterCombinations(inputArr);
        System.out.println(result);
    }

    @Test
    public void testInput9(){
        int[] inputArr = {9};
        String result = MiniCode.letterCombinations(inputArr);
        System.out.println(result);
    }
}
