package Command;

public class WallButton {
    ICommand command;

    public WallButton(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        this.command.execute();
    }
}
