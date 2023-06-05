package sembilan;

/**
 * TestMahasiswaBaru
 */
public class TestManusia {
  public static void main(String[] args) {
    ManusiaDosen dosen = new ManusiaDosen("Bagas", 35, "pria");
    ManusiaMahasiswa student = new ManusiaMahasiswa("Putri", 23, "wanita");
    dosen.info();
    dosen.berjalan();
    dosen.tidur();
    student.info();
    student.berjalan();
    student.tidur();
  }
}