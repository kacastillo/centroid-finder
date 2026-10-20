import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
 
    public class DfsBinaryGroupFinderTest {
    private final BinaryGroupFinder finder = new DfsBinaryGroupFinder();
 
    private static Group group(int size, int x, int y) {
        return new Group(size, new Coordinate(x, y));
    
}


// without output
 @Test
    public void testNullImage() {
        assertThrows(NullPointerException.class, () -> finder.findConnectedGroups(null));
    }
 
    @Test
    public void testNullRow() {
        int[][] image = {{1, 0}, null, {0, 1}};
        assertThrows(NullPointerException.class, () -> finder.findConnectedGroups(image));
    }


    // w zeros
     @Test
    public void testSingleZero() {
        assertTrue(finder.findConnectedGroups(new int[][] {{0}}).isEmpty());
    }
 
    @Test
    public void testAllZeros() {
        int[][] image = {{0, 0, 0}, {0, 0, 0}};
        assertTrue(finder.findConnectedGroups(image).isEmpty());
    }
}