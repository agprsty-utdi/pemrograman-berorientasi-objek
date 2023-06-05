package sembilan;

public abstract class Mahasiswa {
  protected String nama;
  protected int nilai;

  public abstract String isiBiodata(String nama, int nilai);

  public String registrasi() {
    return "nama " + nama + " telah melakukan registrasi";
  }

  public String testMasuk() {
    return "nilai test anda " + nilai;
  }
}
