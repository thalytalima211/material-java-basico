package filas;

public class no<T> {
    private T object;
    private no<T> refNo;

    public no(T object) {
        this.refNo=null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public no<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(no<T> refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "no{" +
                "object=" + object +
                '}';
    }
}
