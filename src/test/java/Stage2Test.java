import org.junit.Test;
import stage2.MappingFactory;
import stage2.MiniCode2;

/**
 * @author chengzi
 * 2019/11/25
 */
public class Stage2Test {

    @Test
    public void test9() {
        int[] inputArr = {2, 4};
        String[] mappingArray = MappingFactory.getMappingArray(9);
        String result = new MiniCode2(mappingArray).letterCombinations(inputArr);
        System.out.println(result);
    }

    @Test
    public void test99() {
        int[] inputArr = {2, 13};
        String[] mappingArray = MappingFactory.getMappingArray(99);
        String result = new MiniCode2(mappingArray).letterCombinations(inputArr);
        System.out.println(result);
    }
}
