package delapan;

public class Sport extends Mobil {
  protected String seri;

  public Sport(String seri, int kec) {
    super(kec);
    this.seri = seri;
    System.out.println(seri);
  }

  public Sport(int kecmaks, String namaken, String seri) {
    super(kecmaks, namaken);
    this.seri = seri;
  }

  @Override
  public void PrintInfoMobil() {
    super.PrintInfoMobil();
    System.out.println("Seri:" + seri);
  }

  public void PrintInfoSport() {
    System.out.println("kecepatan maksimal:" + kecmaks);
    System.out.println("Nama Kendaraan:" + namaken);
    System.out.println("Seri:" + seri);
  }
}
