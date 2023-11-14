package pluralsight;


public class House extends FixedAsset {
    int yearBuilt;
    int squareFeet;
    int bedrooms;

    public House(int yearBuilt, int squareFeet, int bedrooms) {
        super("House", 0);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {

        return squareFeet;
    }
}


