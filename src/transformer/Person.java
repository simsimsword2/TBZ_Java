package transformer;

public class Person {
    private String name;
    private int weight;

    public Person(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void talk(String text){
        System.out.println(text);
    }

    public void eat(){
        System.out.println("mmmmh");
    }

    public void fight(){
        System.out.println("boom boom peng");
    }

    public void die(){
        System.out.println("uuuuugh");
    }

}
