package transformer;

public interface iRobot {
    String model = "T-800";
    int weight = 181;

    void talk(String text);

    void fight();

    void sendMessage();

    void destroy();
}
