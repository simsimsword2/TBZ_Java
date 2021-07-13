package car;

public class Main {
    public static void main(String[] args) {
        UsedCar u = new UsedCar(0, "FortGT", 100000);
        System.out.println(u.getCarPrice());

        u.setMileage(10000);
        System.out.println(u.getCarPrice());



        CrashedCar c = new CrashedCar("FortGT", 100000, 5);
        System.out.println(c.getCarPrice());

        c.setDamageLevel(3);
        System.out.println(c.getCarPrice());
    }
}