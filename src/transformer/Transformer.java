package transformer;

public class Transformer extends Person implements iRobot {
    public Transformer(String name, int weight) {
        super(name, weight);
    }


    @Override
    public void sendMessage() {
        System.out.println("I " + model + " was send to destroy");
    }

    @Override
    public void destroy() {
        System.out.println(weight + " bomb");
    }
}
