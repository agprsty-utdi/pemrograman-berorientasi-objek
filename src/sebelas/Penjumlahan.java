package sebelas;

public class Penjumlahan {
  public static void main(String [] args){
    Jumlah obj = new Jumlah();
    System.out.println(obj.tambah(2,5)); // int, int
    System.out.println(obj.tambah(2, 5, 9)); // int, int, int
    System.out.println(obj.tambah(3.14159, 10)); // double,
    }
}
