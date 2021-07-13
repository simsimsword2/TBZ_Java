package car;

public class UsedCar extends Car {

    private double mileage;

    public UsedCar(double mileage, String model, double price) {
        super(model, price);
        this.mileage = mileage;
    }


    public double getMileage(){
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public double getCarPrice() {
        int reduction = (int) (mileage / 10000);
        double newPrice = startPrice - (startPrice * 0.05 * reduction);

        if (newPrice > 0) {
            return newPrice;
        } else{
            return 0;
        }
    }
}
