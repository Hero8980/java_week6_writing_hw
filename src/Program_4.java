public class Program_4 {
    String name ="prime";
    String Surname = "Testing";
    static boolean a = true;
    static boolean b =false;

    public void instancMethod(){
        System.out.println(name);
        System.out.println(Surname);
        System.out.println(Program_4.a);
        System.out.println(Program_4.b);

    }
    public static void staticMethod(){
        Program_4 obj = new  Program_4();
        System.out.println(obj.name);
        System.out.println(obj.Surname);
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        Program_4 obj = new Program_4();
        obj.instancMethod();
        staticMethod();
    }

}
