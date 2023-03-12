package satu;

public class Pegawai {
    String nama;
    String jabatan;
    int umur;
    String alamat;

    public void setPegawai(String nama, String jabatan, int umur, String alamat){
        this.nama=nama;
        this.jabatan=jabatan;
        this.umur=umur;
        this.alamat=alamat;
    }

    public void tampil(){
        System.out.println("Nama pegawai : "+nama);
        System.out.println("Jabatan pegawai : "+jabatan);
        System.out.println("Umur pegawai : "+umur);
        System.out.println("Alamat pegawai : "+alamat+"\n");
    }
}
