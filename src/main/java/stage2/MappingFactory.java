package stage2;

/**
 * @author chengzi
 * 2019/11/25
 */
public class MappingFactory {

    public static String[] getMappingArray(int limit) {
        if (limit <= 9) {
            return new Limit9MappingArray().create();
        } else if (limit <= 99) {
            return new Limit99MappingArray().create();
        } else {
            return new String[0];
        }
    }
}
