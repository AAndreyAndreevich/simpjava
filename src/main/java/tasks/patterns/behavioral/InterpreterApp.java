package tasks.patterns.behavioral;

public class InterpreterApp {

    public static void main(String[] args) {
        Parser parser = new Parser();
        Expression expression = parser.evaluate("-69+69-69");
        System.out.println(expression.interpret());
    }

    interface Expression {
        int interpret();
    }

    static class NumberExpression implements Expression {
        private int number;
        public NumberExpression(int number) {
            this.number = number;
        }

        @Override
        public int interpret() {
            return number;
        }
    }

    static class AdditionExpression implements Expression {
        private Expression leftOperand;
        private Expression rightOperand;

        public AdditionExpression(Expression leftOperand, Expression rightOperand) {
            this.leftOperand = leftOperand;
            this.rightOperand = rightOperand;
        }

        @Override
        public int interpret() {
            return leftOperand.interpret() + rightOperand.interpret();
        }
    }

    static class SubstractionExpression implements Expression {
        private Expression leftOperand;
        private Expression rightOperand;

        public SubstractionExpression(Expression leftOperand, Expression rightOperand) {
            this.leftOperand = leftOperand;
            this.rightOperand = rightOperand;
        }

        @Override
        public int interpret() {
            return leftOperand.interpret() - rightOperand.interpret();
        }
    }

    static class Parser {
        Expression evaluate(String str) {
            int position = str.length() - 1;
            while (position > 0) {
                if (Character.isDigit(str.charAt(position))) {
                    position--;
                } else {
                    Expression leftOperand = evaluate(str.substring(0, position));
                    Expression rightOperand = new NumberExpression(Integer.parseInt(str.substring(position + 1)));

                    char operator = str.charAt(position);
                    switch (operator) {
                        case '+':
                            return new AdditionExpression(leftOperand, rightOperand);
                        case '-':
                            return new SubstractionExpression(leftOperand, rightOperand);
                    }
                }
            }
            int result = Integer.parseInt(str);
            return new NumberExpression(result);
        }
    }
}