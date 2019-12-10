import org.junit.Test;
import stage2.MappingFactory;
import stage2.MiniCode2;
import utils.IntegerArrDisplayUtil;

/**
 * @author chengzi
 * 2019/11/25
 */
public class Stage2Test {

    @Test
    public void test9() {
        Integer[] inputArr = {2, 4};
        System.out.println("输入为：" + IntegerArrDisplayUtil.displayToString(inputArr));
        String[] mappingArray = MappingFactory.getMappingArray(9);
        String result = new MiniCode2(mappingArray).letterCombinations(inputArr);
        System.out.println("输出为：" + result);
    }

    @Test
    public void test99() {
        Integer[] inputArr = {2, 13};
        System.out.println("输入为：" + IntegerArrDisplayUtil.displayToString(inputArr));
        String[] mappingArray = MappingFactory.getMappingArray(99);
        String result = new MiniCode2(mappingArray).letterCombinations(inputArr);
        System.out.println("输出为：" + result);
    }
}
