package ChainOfResponsibility;

public class Manager extends Employee{
    public Manager(Employee superior) {
        super(superior);
    }

    @Override
    public void requestRaise(int percentage) {
        if (percentage <= 2) {
            System.out.println("Raise granted by manager.");
        } else {
            super.requestRaise(percentage);
        }
    }
}
