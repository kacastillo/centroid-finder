import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EuclideanColorDistanceTest {
    private final ColorDistanceFinder finder = new EuclideanColorDistance();

    //black 0x000000
    // white 0xFFFFFF
    // red 0xFF0000
    // blue 0x0000FF

    // same color test
    @Test
    public void testSameColorIsZero() {
        assertEquals(0.0, finder.distance(0xFFFFFF, 0xFFFFFF), 0.0001);    
}

    // black vs white expected 441.6729559300637 from WolframAlpha
    @Test
    public void testBlackToWhite() {
        assertEquals(441.6729559300637, finder.distance(0x000000, 0xFFFFFF), 0.0001);
    }
}