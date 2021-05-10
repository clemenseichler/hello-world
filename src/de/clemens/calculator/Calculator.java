
public class Calculator {

    public static final int CHECK = 0;

    public void calculate() {
        int op = getOperator();
        int op1 = getOperand();
        int op2 = getOperand();
        int result = calcualteResult(op, op1, op2);
        System.out.println("Result of operation " + getOperationText(op) + " with the numbers " + op1 + " and " + op2
                + " is: " + result);
    }

    private String getOperationText(int op) {
        return null;
    }

    private int calcualteResult(int op, int op1, int op2) {
        return 0;
    }

    private int getOperand() {
        return 0;
    }

    private int getOperator() {
        return 0;
    }
}
