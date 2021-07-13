package car;

public class CrashedCar extends Car {

    private int damageLevel;

    public void setDamageLevel(int damageLevel) {
        if (damageLevel > 3 || damageLevel < 0){
            System.out.println("invalid damage level");
        } else {
            this.damageLevel = damageLevel;
        }
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    public CrashedCar(String model, double price, int damageLevel) {
        super(model, price);
        this.damageLevel = damageLevel;
    }

    @Override
    public double getCarPrice() {
        double reduction;

        switch (damageLevel){
            case 0:
                reduction = 0.1;
                break;

            case 1:
                reduction = 0.5;
                break;

            case 2:
                reduction = 0.9;
                break;

            case 3:
                reduction = 1;
                break;

            default:
                reduction = 0;
        }

        reduction *= startPrice;
        double newPrice = startPrice - reduction;

        return newPrice;
    }
}
