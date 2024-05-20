public class Date {

    private int MAX_YEAR = 2024;
    private int y;
    private int m;
    private int d;

    public Date(int y, int m, int d) {
        setY(y);
        setM(m);
        this.d = d;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y <= MAX_YEAR) {
            this.y = y;
        }
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        if (m >= 1  &&  m <= 12) {
            this.m = m;
        }
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return (d > 9 ? d : "0" + d) + "/" + (m > 9 ? m : "0" + m) + "/" + y;
    }
}
