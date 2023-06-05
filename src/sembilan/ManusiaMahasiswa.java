package sembilan;

public class ManusiaMahasiswa extends Manusia {
  ManusiaMahasiswa(String nama, int umur, String jenisKelamin) {
    this.nama = nama;
    this.umur = umur;
    this.jenisKelamin = jenisKelamin;
  }

  public void info() {
    System.out.println("Mahasiswa bernama "+ this.nama +", umur "+ this.umur + ", jenis kelamin "+ this.jenisKelamin);
  }

  public void berjalan() {
    System.out.println(this.nama +" sedang berjalan ke arah taman");
  }

  public void tidur() {
    System.out.println(this.nama +" sedang tidur");
  }
}
