package SOLID.LSP;

public class SubstractOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    @Override
    public boolean isInvalid() {
        return false;
    }
}