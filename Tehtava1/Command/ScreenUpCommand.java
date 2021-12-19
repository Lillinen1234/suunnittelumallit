package Command;

public class ScreenUpCommand implements ICommand{
    private Screen s;

    public ScreenUpCommand(Screen s) {
        this.s = s;
    }

    @Override
    public void execute() {
        s.screenUp();
    }
}
