package SOLID.DIP;

public class Calculator {

    public int calculate(AbstractOperation operation, int firstNumber, int secondNumber) {
        int answer = 0;

        answer = operation.operate(firstNumber, secondNumber);

        return answer;
    }
}