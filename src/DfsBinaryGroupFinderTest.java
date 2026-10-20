import static org.junit.jupiter.api.Assertions.assertThrows;

public class DfsBinaryGroupFinderTest {
    
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