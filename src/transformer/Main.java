package transformer;

public class Main {

    public static void main(String[] args) {
        Transformer t = new Transformer("Arnold", 80);

        t.destroy();
        t.sendMessage();
        t.die();
        t.eat();
        t.fight();
        t.talk("salli zämä");
    }
}
