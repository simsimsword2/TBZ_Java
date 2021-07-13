package car;

abstract class Car {

    protected String model;
    protected double startPrice;

    public Car(String model, double price) {
        this.model = model;
        this.startPrice = price;
    }

    public abstract double getCarPrice();
}
