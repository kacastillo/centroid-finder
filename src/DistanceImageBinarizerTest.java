import static org.junit.jupiter.api.Assertions.*;
import java.awt.image.BufferedImage;
import org.junit.jupiter.api.Test;


public class DistanceImageBinarizerTest {
    
 @Test
    public void testExactTargetColor() {
    int target = 0xFF0000;

     ColorDistanceFinder finder = (a, b) ->
          a == b ? 0.0 : 100.0;

     DistanceImageBinarizer binarizer =
      new DistanceImageBinarizer(finder, target, 10);

        BufferedImage input = new BufferedImage(
         1, 1, BufferedImage.TYPE_INT_RGB
        );
        input.setRGB(0, 0, target);

        int[][] result = binarizer.toBinaryArray(input);

     assertEquals(1, result[0][0]);
    }

@Test
public void testDistanceEqualToThresholdIsBlack() {
     int target = 0xFF0000;

     ColorDistanceFinder finder = (a, b) -> 10.0;

     DistanceImageBinarizer binarizer =
        new DistanceImageBinarizer(finder, target, 10);

     BufferedImage input = new BufferedImage(
          1, 1, BufferedImage.TYPE_INT_RGB );

    int[][] result = binarizer.toBinaryArray(input);

     assertEquals(0, result[0][0]);
    }

 @Test
public void testAllZerosProduceBlackImage() {
     int[][] pixels = {
           {0, 0},
          {0, 0}
        };

 ColorDistanceFinder finder = (a, b) -> 0.0;

     DistanceImageBinarizer binarizer =
          new DistanceImageBinarizer(finder, 0, 10);

     BufferedImage result = binarizer.toBufferedImage(pixels);

       assertEquals(2, result.getWidth());
     assertEquals(2, result.getHeight());

     for (int y = 0; y < result.getHeight(); y++) {
         for (int x = 0; x < result.getWidth(); x++) {
               assertEquals(0x000000, result.getRGB(x, y)
                   & 0x00FFFFFF);
            }
        }
    }

 @Test
    public void testAllOnesProduceWhiteImage() {
        int[][] pixels = {
            {1, 1},
            {1, 1}
        };

        ColorDistanceFinder finder = (a, b) -> 0.0;

        DistanceImageBinarizer binarizer =
            new DistanceImageBinarizer(finder, 0, 10);

        BufferedImage result = binarizer.toBufferedImage(pixels);

        for (int y = 0; y < result.getHeight(); y++) {
            for (int x = 0; x < result.getWidth(); x++) {
                assertEquals(0xFFFFFF, result.getRGB(x, y)
                    & 0x00FFFFFF);
            }
        }
    }

 @Test
    public void testMixedPixelsKeepCorrectPositions() {
        int[][] pixels = {
            {1, 0},
            {0, 1}
        };

        ColorDistanceFinder finder = (a, b) -> 0.0;

        DistanceImageBinarizer binarizer =
            new DistanceImageBinarizer(finder, 0, 10);

        BufferedImage result = binarizer.toBufferedImage(pixels);

        assertEquals(0xFFFFFF, result.getRGB(0, 0) & 0x00FFFFFF);
        assertEquals(0x000000, result.getRGB(1, 0) & 0x00FFFFFF);
        assertEquals(0x000000, result.getRGB(0, 1) & 0x00FFFFFF);
        assertEquals(0xFFFFFF, result.getRGB(1, 1) & 0x00FFFFFF);
    }
}

