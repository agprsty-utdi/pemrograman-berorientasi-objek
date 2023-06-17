package sepuluh;

public class TestInherInterface {
  public static void main(String[] arg) {
    Child anak = new Child(5);
    anak.func();
    System.out.println("nilai dari method getValue:" + anak.getValue());
  }
}
