public class Program_3 {
    String name = "prime";
    static String surname = "Testing";
    public void instanceMethod(){
        System.out.println(name);
        System.out.println(Program_3.surname);
    }
    public static void staticMethod(){
      Program_3 obj = new Program_3();
        System.out.println(obj.name);
        System.out.println(surname);

    }

    public static void main(String[] args) {
        Program_3 obj = new Program_3();
        obj.instanceMethod();
        staticMethod();
    }

}
