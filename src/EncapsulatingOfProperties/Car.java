package EncapsulatingOfProperties;

public class Car {
    private String maker;
    private String color;
    private String bodyType;

    public static String accelerate(){
        String motion = "Speeding Up...";
        return motion;
    }
    public void setCar(String brand, String paint, String style){
        maker = brand;
        color = paint;
        bodyType = style;
    }
    public void getCar(){
        System.out.println(maker + " Color " + color);
        System.out.println(maker + " bodyType " + bodyType);
        System.out.println(maker + " " + accelerate() + "\n");
    }
}
