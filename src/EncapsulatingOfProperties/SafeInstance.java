package EncapsulatingOfProperties;

public class SafeInstance {
    public static void main(String[] args) {
        Car Porsche = new Car();
        Porsche.setCar("Porsche", "Red", "Coupe");
        Porsche.getCar();
        Car Bentley = new Car();
        Bentley.setCar("Bentley", "Green", "Sedan");
        Bentley.getCar();
    }
}
