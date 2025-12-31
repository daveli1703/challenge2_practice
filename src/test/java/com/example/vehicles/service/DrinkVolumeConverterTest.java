import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DrinkVolumeConverterTest {

    @Test
    public void testMillilitresToCups() {
        DrinkVolumeConverter converter = new DrinkVolumeConverter();
        double result = converter.millilitresToCups(500);
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testCupsToMillilitres() {
        DrinkVolumeConverter converter = new DrinkVolumeConverter();
        double result = converter.cupsToMillilitres(2);
        assertEquals(500.0, result, 0.0001);
    }

    @Test
    public void testNegativeInputRejected() {
        DrinkVolumeConverter converter = new DrinkVolumeConverter();
        assertThrows(
            IllegalArgumentException.class,
            () -> converter.millilitresToCups(-1)
        );
    }

    @Test
    public void testZeroMillilitres() {
        DrinkVolumeConverter converter = new DrinkVolumeConverter();
        double result = converter.millilitresToCups(0);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testFractionalConversion() {
        DrinkVolumeConverter converter = new DrinkVolumeConverter();
        double result = converter.millilitresToCups(125);
        assertEquals(0.5, result, 0.0001);
    }

}
