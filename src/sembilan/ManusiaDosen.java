package sembilan;

public class ManusiaDosen extends Manusia {
  ManusiaDosen(String nama, int umur, String jenisKelamin) {
    this.nama = nama;
    this.umur = umur;
    this.jenisKelamin = jenisKelamin;
  }

  public void info() {
    System.out.println("Dosen bernama "+ this.nama +", umur "+ this.umur + ", jenis kelamin "+ this.jenisKelamin);
  }

  public void berjalan() {
    System.out.println(this.nama +" sedang berjalan ke arah kelas");
  }

  public void tidur() {
    System.out.println(this.nama +" sedang tidur");
  }
}
