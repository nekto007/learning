package CreateObjectClass;

public class FirstObject {
    public static void main(String[] args) {
        System.out.println("Color: " + Car.color);
        System.out.println("Body Type: " + Car.bodyType);
        System.out.println(Car.accelerate());

        Car Porsche = new Car();
        System.out.println("Porsche Color: " + Porsche.color);
        System.out.println("Porsche Body Type: " + Porsche.bodyType);
        System.out.println(Porsche.accelerate());
    }
}

