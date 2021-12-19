package Builder;

public class McDonaldsBurger {
    private StringBuilder sb;

    public McDonaldsBurger() {
        this.sb = new StringBuilder();
    }

    public void setPart(String part) {
        this.sb.append(part);
        this.sb.append(", ");
    }

    public void getBurger() {
        System.out.println("McDonalds burger:");
        System.out.println(sb.toString());
    }
}
