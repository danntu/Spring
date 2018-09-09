package javatpoint.fabric_method.type2;

public class PrintableFactory {
    public static Printable getPrintableA() {
        return new A();
    }

    public static Printable getPrintableB() {
        return new B();
    }
}
