package SOLID.LSP;

public class AddOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public boolean isInvalid() {
        return false;
    }
}