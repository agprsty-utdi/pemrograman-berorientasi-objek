package sebelas;

public class BurungTest {
  public static void main(String[] args) {
    Burung merpati = new Burung();
    merpati.bergerak();
    Sayap sayap = new Sayap();
    Kaki kaki = new Kaki();
    merpati.setAlatGerak(sayap);
    merpati.bergerak();
    merpati.setAlatGerak(kaki);
    merpati.bergerak();
  }
}