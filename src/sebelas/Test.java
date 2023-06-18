package sebelas;

public class Test {
  public static void main(String[] args) {
    Roda2 roda2ku;
    Motor motorku;
    Kendaraan k = new Kendaraan();
    roda2ku = new Roda2();
    motorku = new Motor();
    k.info();
    k = roda2ku;
    k.info();
    k = motorku;
    k.info();
  }
}
