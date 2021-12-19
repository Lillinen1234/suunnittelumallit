package Command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Screen s = new Screen();
        ICommand sdc = new ScreenDownCommand(s);
        ICommand suc = new ScreenUpCommand(s);
        WallButton upButton = new WallButton(suc);
        WallButton downButton = new WallButton(sdc);

        Scanner sc = new Scanner(System.in);

        System.out.println("Down or up?");
        String in = sc.nextLine();

        do {
            in = in.toLowerCase();
            switch (in) {
                case "down":
                    downButton.pressButton();
                    break;
                case "up":
                    upButton.pressButton();
                    break;
                default:
                    break;

            }
            System.out.println("Down or up");
            in = sc.nextLine();
        } while (!in.equals("stop"));

    }
}
