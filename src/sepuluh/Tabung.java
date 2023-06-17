package sepuluh;

public class Tabung implements Bangun3D, Pola{  
  private int tinggi;
  private String warna;
  private final Lingkaran alas;

  public Tabung(Lingkaran lingkaran) {
    this.alas = lingkaran;
  }

  public void setTinggi(int tinggi) {
    this.tinggi = tinggi;
  }

  public void setWarna(String warna) {
    this.warna = warna;
  }

  public double getTinggi() {
    return this.tinggi;
  }

  public String getWarna() {
    return this.warna;
  };

  public double hitungLuas() {
    return this.alas.hitungLuas();
  }

  public double hitungVolume() {
    return hitungLuas() * getTinggi();
  }

  public void tampilInfo() {
    System.out.println("Warna "+getWarna() + ": ini info dari method tampilInfo");
  }
}
