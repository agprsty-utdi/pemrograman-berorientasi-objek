package sembilan;

public class Segitiga extends Bentuk {
    public Segitiga(int panjang, int lebar) {
      this.panjang = panjang;
      this.lebar = lebar;
    }

    public String getBentuk() {
      return "bentuk segitiga";
    }

    public int hitungLuas() {
      return (panjang*lebar)/2;
    }
}
