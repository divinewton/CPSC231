public class Car {
    
    private int modelYear;
    private int purchasePrice;
    private int currentValue;

    // default constructor
    public void Car(int modelYear, int purchasePrice) {
        this.modelYear = modelYear;
        this.purchasePrice = purchasePrice;
    }

    // overloaded constructor
    public void Car(int purchasePrice) {
        this.modelYear = 2024; // sets to current year
        this.purchasePrice = purchasePrice;
    }

    // copy constructor
    public void Car(Car car) {
        this.modelYear = car.modelYear;
        this.purchasePrice = car.purchasePrice;
    }

    public void setPurchasePrice(int userPrice) {
        purchasePrice = userPrice;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setModelYear(int userYear) {
        modelYear = userYear;
    }

    public int getModelYear() {
        return this.modelYear;
    }

    public void calcCurrentValue(int currentYear, double dpRate) {
        int carAge = currentYear - modelYear;

        currentValue = (int)Math.round(purchasePrice * Math.pow((1-dpRate), carAge));
    }

    public void printInfo(double dpRate) {
        System.out.println("Car's Information:");
        System.out.println(" Model Year: " + modelYear);
        System.out.println(" Purchase Price: $" + purchasePrice);
        System.out.println(" Depreciation Rate: " + (dpRate * 100) + "%");
        System.out.println(" Current Value: $" + currentValue);
    }
}