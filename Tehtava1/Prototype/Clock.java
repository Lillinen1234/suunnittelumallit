package Prototype;

public class Clock implements Cloneable{
    protected Pointer hPointer;
    protected Pointer mPointer;
    protected Pointer sPointer;

    public Clock() {
        this.hPointer = new Pointer(24);
        this.mPointer = new Pointer(60);
        this.sPointer = new Pointer(60);
    }

    public void advance() {
        if (sPointer.increment())
            if (mPointer.increment())
                hPointer.increment();
    }

    public String time() {
        return hPointer+":"+mPointer+":"+sPointer;
    }

    public void setTime(int h, int m, int s) {
        this.hPointer.setTime(h);
        this.mPointer.setTime(m);
        this.sPointer.setTime(s);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Clock deepClone() {
        Clock c = null;
        try {
            c = (Clock)super.clone();
            c.hPointer = (Pointer) this.hPointer.clone();
            c.mPointer = (Pointer) this.mPointer.clone();
            c.sPointer = (Pointer) this.sPointer.clone();
            return c;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
