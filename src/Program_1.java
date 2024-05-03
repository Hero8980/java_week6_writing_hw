public class Program_1 {
    int a =10;
    int b =20;
    public void instanceMethod(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Program_1 obj= new Program_1();
        obj.instanceMethod();

    }
}
