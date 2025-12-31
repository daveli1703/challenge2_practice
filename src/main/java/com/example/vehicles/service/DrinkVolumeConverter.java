public class DrinkVolumeConverter {

    public double millilitresToCups(double ml) {
        if (ml < 0) {
            throw new IllegalArgumentException("Millilitres cannot be negative");
        }
        return ml / 250;
    }

    public double cupsToMillilitres(double cups) {
        if (cups < 0) {
            throw new IllegalArgumentException("Cups cannot be negative");
        }
        return cups * 250;
    }
}