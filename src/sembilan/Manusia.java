package sembilan;

abstract class Manusia {  
  protected String nama;
  protected int umur;
  protected String jenisKelamin;

  public abstract void info();

  public abstract void berjalan();

  public void tidur() {
      System.out.println("Manusia sedang tidur");
  }
}
