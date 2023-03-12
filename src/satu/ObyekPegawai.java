package satu;

public class ObyekPegawai {
    public static void main(String[] args){
        Pegawai pegawai1 = new Pegawai();
        pegawai1.setPegawai("Agung","CEO",22,"pesawaran, lampung");
        pegawai1.tampil();

        Pegawai pegawai2 = new Pegawai();
        pegawai2.setPegawai("Fajar","Programmer",20,"bantul, jogjakarta");
        pegawai2.tampil();
    }
}