package satu;

public class ObyekBuku {
    public static void main(String[] args){
        Buku buku1 = new Buku();
        buku1.setBuku("Surat Cinta Untuk Starla",75000,200);
        buku1.tampil();

        Buku buku2 = new Buku();
        buku2.setBuku("Psicology of Money ",75000,200);
        buku2.tampil();

        Buku buku3 = new Buku();
        buku3.setBuku("How Rich Person",75000,200);
        buku3.tampil();
    }
}