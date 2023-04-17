public class Lamp {
    String typeLamp;
    String color;
    int watts;

    public  Lamp (String typeLamp, String color, int watts){
        this.typeLamp = typeLamp;
        this.color = color;
        this.watts = watts;
    }

    void turnOn () {
        System.out.println("A luz esta ligada!");
    }

    void turnOff () {
        System.out.println("A luz esta apagada!");
    }
}