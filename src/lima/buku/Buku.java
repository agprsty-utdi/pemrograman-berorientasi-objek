package lima.buku;

public class Buku {
    String Judul;
    int Harga;
    int Halaman;

    public Buku(String judul, int harga, int halaman)
    {
        Judul = judul;
        Harga = harga;
        Halaman = halaman;
    }

    public void show() {
        System.out.println("Informasi Buku");
        System.out.println("Judul : "+Judul);
        System.out.println("Harga : "+Harga);
        System.out.println("Halaman : "+Halaman);
    }
}
