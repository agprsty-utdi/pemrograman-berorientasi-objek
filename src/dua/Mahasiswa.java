package dua;

public class Mahasiswa {
    public static final String PREFIX_NIM = "2154110";
    String namaDepan;
    String namaBelakang;
    int nim;
    String jurusan;

    public void setMahasiswa(String namaDepan, String namaBelakang, int nim, String jurusan){
        this.namaDepan=namaDepan;
        this.namaBelakang=namaBelakang;
        this.nim=nim;
        this.jurusan=jurusan;
    }

    public String getFullname(){
        return this.namaDepan+" "+this.namaBelakang;
    }

    public String getNim(){
        return PREFIX_NIM+Integer.toString(this.nim);
    }

    public String getJurusan(){
        return this.jurusan;
    }

    public void tampil(){
        System.out.println("NIM mahasiswa : "+ getNim());
        System.out.println("Nama lengkap mahasiswa : "+ getFullname());
        System.out.println("Jurusan mahasiswa : "+ getJurusan() +"\n");
    }
}
