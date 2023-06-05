package sembilan;

public class MahasiswaBaru extends Mahasiswa {
  public String isiBiodata(String nama, int nilai) {
    this.nama = nama;
    this.nilai = nilai;
    return "nama "+ nama + ", nilai "+ nilai;
  }
}
