package sepuluh;

public class TestLingkaran {
  public static void main(String[] arg){
    Lingkaran bunder = new Lingkaran();
    bunder.setJejari(10);
    double luas = bunder.hitungLuas();
    double keliling = bunder.hitungKeliling();
    System.out.println("Luas lingkaran dengan jejari "+bunder.getJejari()+" adalah "+luas);
    System.out.println("Keliling lingkaran dengan jejari "+bunder.getJejari()+" adalah "+keliling);
  }
}
