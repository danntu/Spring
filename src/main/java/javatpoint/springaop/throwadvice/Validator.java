package javatpoint.springaop.throwadvice;

public class Validator {
    public void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not valid age");
        } else {
            System.out.println("vote confirmed");
        }
    }
}
