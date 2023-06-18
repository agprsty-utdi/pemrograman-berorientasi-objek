package sebelas;

public class Burung {
  private AlatGerak alatGerak = new AlatGerak();

  Burung() {
    System.out.println("Hai saya Burung");
  }

  public void bergerak() {
    alatGerak.bergerak();
  }

  public void setAlatGerak(AlatGerak alatGerak) {
    this.alatGerak = alatGerak;
    System.out.println("Sekarang saya pakai " +
        alatGerak);
  }
}
