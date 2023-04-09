package empat;

public class Buku {
    String Judul;
    int Harga;
    int Halaman;
    Buku(String judul, int harga, int halaman) // Constructor
    {
        Judul = judul;
        Harga = harga;
        Halaman = halaman;
    }

    Buku () // Constructor
    {
        Judul = "Atomic Habits";
        Harga = 75000;
        Halaman = 150;
    }

    void show() {
        System.out.println("Informasi Buku");
        System.out.println("Judul : "+Judul);
        System.out.println("Harga : "+Harga);
        System.out.println("Halaman : "+Halaman);
    }

    public static void main(String args[])
    {
        Buku buku1 = new Buku();
        Buku buku2 = new Buku("The Psichology of Money",150000,273);

        buku1.show();
        buku2.show();
    }
}
