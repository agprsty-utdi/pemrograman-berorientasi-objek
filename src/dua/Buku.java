package dua;

public class Buku {
    String judul;
    int harga;
    int halaman;

    public void setBuku(String judul, int harga, int halaman){
        this.judul=judul;
        this.harga=harga;
        this.halaman=halaman;
    }

    public String getJudul(){
        return this.judul;
    }

    public String getHarga(){
        return "Rp. "+this.harga;
    }

    public void tampil(){
        System.out.println("Judul buku : "+ getJudul());
        System.out.println("Harga buku : "+ getHarga());
        System.out.println("Halaman buku : "+ halaman +"\n");
    }
}
