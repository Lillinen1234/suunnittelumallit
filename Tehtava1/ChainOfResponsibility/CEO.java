package ChainOfResponsibility;

public class CEO extends Employee{
    public CEO() {
        super(null);
    }

    @Override
    public void requestRaise(int percentage) {
        System.out.println("Raise granted by CEO.");
    }
}
