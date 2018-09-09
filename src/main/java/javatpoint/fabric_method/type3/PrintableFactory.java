package javatpoint.fabric_method.type3;

public class PrintableFactory {
    public Printable getPrintable() {
        return new A();
    }

}
