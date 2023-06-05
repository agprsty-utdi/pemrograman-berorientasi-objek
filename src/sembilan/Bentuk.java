package sembilan;

public abstract class Bentuk {
    protected int panjang;
    protected int lebar;

    public String getBentuk() {
        return "bentuk dasar";
    }

    public abstract int hitungLuas();
}