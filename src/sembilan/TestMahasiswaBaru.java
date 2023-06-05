package sembilan;

/**
 * TestMahasiswaBaru
 */
public class TestMahasiswaBaru {
  public static void main(String[] args) {
    MahasiswaBaru student = new MahasiswaBaru();
    System.out.println(student.isiBiodata("Agung", 80));
    System.out.println(student.registrasi());
    System.out.println(student.testMasuk());
  }
}