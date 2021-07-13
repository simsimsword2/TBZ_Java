package shoppingCart;

public class Main {

    public static void main(String[] args) {
        Apple a = new Apple();
        Pencil p1 = new Pencil();
        Pencil p2 = new Pencil();
        Pencil p3 = new Pencil();

        ShoppingCart sc = new ShoppingCart();

        sc.content.add(a);
        sc.content.add(p1);
        sc.content.add(p2);
        sc.content.add(p3);


        sc.sum();
    }
}
