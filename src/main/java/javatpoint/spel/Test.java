package javatpoint.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        Expression expression = parser.parseExpression("'Hello SPEL'");
        String message = (String) expression.getValue();
        System.out.println(message);

        expression = parser.parseExpression("'Welcome SPEL'.concat('!')");
        message = (String) expression.getValue();
        System.out.println(message);
    }
}
