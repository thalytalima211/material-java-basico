package pilhas;

public class no {
    private int dado;
    private no refNo = null;

    public no() {
    }

    public no(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public no getRefNo() {
        return refNo;
    }

    public void setRefNo(no refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "no{" +
                "dado=" + dado +
                '}';
    }
}
