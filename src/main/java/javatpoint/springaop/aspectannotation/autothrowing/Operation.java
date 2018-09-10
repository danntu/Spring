package javatpoint.springaop.aspectannotation.autothrowing;

public class Operation {
    public void valid(int age) throws Exception {
        if (age < 18) {
            throw new ArithmeticException("Not vald age");
        } else {
            System.out.println("Thanks for vote");
        }
    }
}
