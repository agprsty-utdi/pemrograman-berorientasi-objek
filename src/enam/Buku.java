package enam;

public class Buku {
    private String Judul;
    private int Harga;
    private int Halaman;
    private Pegawai PembeliBuku;

    public Buku()
    {
        this.Judul = "Do You Do";
        this.Harga = 75000;
        this.Halaman = 210;
        this.PembeliBuku = new Pegawai();
        PembeliBuku.setNama("Agung");
        PembeliBuku.setJabatan("Programmer");
        PembeliBuku.setGaji(50000000);
    }

    public void show() {
        System.out.println("Informasi Buku");
        System.out.println("Judul : "+Judul);
        System.out.println("Harga : "+Harga);
        System.out.println("Halaman : "+Halaman);
        PembeliBuku.cetakPegawai();
    }
}
