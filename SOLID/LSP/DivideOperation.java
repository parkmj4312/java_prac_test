package SOLID.LSP;

public class DivideOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    @Override
    public boolean isInvalid() {
        return true;
    }
}