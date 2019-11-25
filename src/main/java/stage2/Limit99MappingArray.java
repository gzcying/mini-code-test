package stage2;

/**
 * @author chengzi
 * 2019/11/25
 */
public class Limit99MappingArray implements MappingArray{
    @Override
    public String[] create() {
        return new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz",
                    "","","11","12","13","14","15","16","17","18"
        //省略后续
        };
    }
}
