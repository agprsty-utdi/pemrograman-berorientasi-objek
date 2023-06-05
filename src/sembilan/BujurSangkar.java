package sembilan;

public class BujurSangkar extends Bentuk {
    public BujurSangkar(int panjang, int lebar) {
      this.panjang = panjang;
      this.lebar = lebar;
    }

    public String getBentuk() {
      return "bentuk bujur sangkar";
    }

    public int hitungLuas() {
      return panjang*lebar;
    }
}
