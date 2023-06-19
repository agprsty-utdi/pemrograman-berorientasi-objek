package duabelas;

public class BagiNol {
  public static void main(String[] args) {
    System.out.println("Sebelum pembagian");
    try {
      System.out.println(5/0);
    }catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
    System.out.println("Sesudah pembagian");
  }
} 