public class SubClass extends SuperClass {
    public static void main(String[] args) {
        hello();
        SuperClass.hello();
        try {
            echo( args[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e);
        }
    }
    public static void hello(){
        System.out.println("Hello from SubClass");
    }
}
