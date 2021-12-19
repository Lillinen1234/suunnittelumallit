package ChainOfResponsibility;

public class DepartmentManager extends Employee{
    public DepartmentManager(Employee superior) {
        super(superior);
    }

    @Override
    public void requestRaise(int percentage) {
        if (percentage <= 5) {
            System.out.println("Raise granted by department manager.");
        } else {
            super.requestRaise(percentage);
        }
    }
}
