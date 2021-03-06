package vendingManager;

import java.time.LocalDate;

public class Consumable extends Vending_item {
    private LocalDate expirations_date;


    public Consumable(String name, String brand, Double price, LocalDate expirations_date) {
        super(name, brand, price);
        this.expirations_date = expirations_date;
    }


    @Override
    String stillgood() {
        if (this.expirations_date.compareTo(LocalDate.now()) >= 0) {
            return "true";
        } else {
            return this.expirations_date.toString();
        }
    }
}
