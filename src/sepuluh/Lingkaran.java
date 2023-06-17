package sepuluh;

public class Lingkaran implements Bangun2D {
  private double jejari;

  public void setJejari(double jejari) {
    this.jejari = jejari;
  }

  public double getJejari() {
    return this.jejari;
  }

  public double hitungLuas() {
    return (3.14 * this.jejari * this.jejari);
  }

  public double hitungKeliling() {
    return (2 * 3.14 * this.jejari);
  }
}
