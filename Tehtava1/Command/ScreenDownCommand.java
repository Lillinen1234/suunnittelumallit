package Command;

public class ScreenDownCommand implements ICommand{
    Screen s;

    public ScreenDownCommand(Screen s) {
        this.s = s;
    }

    @Override
    public void execute() {
        s.screenDown();
    }
}
