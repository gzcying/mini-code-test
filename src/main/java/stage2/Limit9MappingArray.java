package stage2;

/**
 * @author chengzi
 * 2019/11/25
 */
public class Limit9MappingArray implements MappingArray {
    @Override
    public String[] create() {
        return new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    }
}
