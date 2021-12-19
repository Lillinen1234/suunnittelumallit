package Prototype;

public class Pointer implements Cloneable{
    private Integer state, max;

    public Pointer(Integer max) {
        this.state = 0;
        this.max = max;
    }

    public boolean increment() {
        if (state + 1 > max) {
            state = 0;
            return true;
        }
        state++;
        return false;
    }

    public void setTime(Integer time) {
        this.state = time;
    }

    public int getTime() {
        return this.state;
    }

    @Override
    public String toString() {
        return String.valueOf(this.state);
    }

    public Object clone() {

        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
