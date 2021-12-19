package ChainOfResponsibility;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Employee {
    private final Employee superior;

    public void requestRaise(int percentage) {
        if (superior != null) {
            System.out.println("Forwarding request to superior.");
            superior.requestRaise(percentage);
        }
    }

}
