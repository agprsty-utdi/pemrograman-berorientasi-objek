package sepuluh;

public class TestTabung {
  public static void main(String[] args) {
    Lingkaran lkn = new Lingkaran();
    lkn.setJejari(10);
    double luas = lkn.hitungLuas();

    Tabung tbg = new Tabung(lkn);
    tbg.setWarna("merah");
    tbg.setTinggi(5);
    double volume = tbg.hitungVolume();
    System.out.println("Luas lingkaran dengan jejari "+lkn.getJejari()+" adalah "+luas);
    System.out.println("Volume Tabung dengan tinggi "+tbg.getTinggi()+" adalah "+volume);
    tbg.tampilInfo();
  }
}
