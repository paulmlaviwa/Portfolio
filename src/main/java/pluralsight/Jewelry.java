package pluralsight;

public class Jewelry extends FixedAsset {
    double karat;

    public Jewelry(String name, double karat) {
        super(name, 0);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return karat;
    }
}
