public class SuperClass {
    public static void hello(){
        System.out.println("Hello from SuperClass");
    }
    public static void echo( String arg){
        try {
            System.out.println("Your enter: " + arg);
        }catch (Exception e){
            System.out.println("Need argument");
        }
    }
}
