package ChainOfResponsibility;

public class Worker extends Employee{
    public Worker(Employee superior) {
        super(superior);
    }
}
