package dua;

public class ObyekMahasiswa {
    public static void main(String[] args){
        final String NAMA_BELAKANG = "prasetyo";
        final String JURUSAN = "Informatika";

        Mahasiswa[] mahasiswa = new Mahasiswa[3];
        
        for(int i=0;i<3;i++){
            mahasiswa[i] = new Mahasiswa();
        }

        mahasiswa[0].setMahasiswa("agung", NAMA_BELAKANG, 97, JURUSAN);
        mahasiswa[1].setMahasiswa("fajar", NAMA_BELAKANG, 98, JURUSAN);
        mahasiswa[2].setMahasiswa("andi", NAMA_BELAKANG, 99, JURUSAN);
        
        for(int i=0;i<3;i++) {
            System.out.println("Mahasiswa ke: "+i);
            mahasiswa[i].tampil();
        }
    }
}