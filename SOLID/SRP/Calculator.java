package SOLID.SRP;

public class Calculator {
    AddOperation add;
    SubstractOperation sub;
    MultiplyOperation multi;
    DivideOperation divide;

    public int calculate(String operator, int firstNumber, int secondNumber) {
        int answer = 0;
        add = new AddOperation();
        sub = new SubstractOperation();
        multi = new MultiplyOperation();
        divide = new DivideOperation();

        if(operator.equals("+")){
            answer = add.operate(firstNumber,secondNumber);
        }else if(operator.equals("-")){
            answer = sub.operate(firstNumber,secondNumber);
        }else if(operator.equals("*")){
            answer = multi.operate(firstNumber,secondNumber);
        }else if(operator.equals("/")){
            answer = divide.operate(firstNumber,secondNumber);
        }

        return answer;
    }
}