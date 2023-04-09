package tiga;

public class BilanganPangkat {
    int nilai, pangkat;

    public void setBilanganPangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    public double setNilai() {
        return (this.nilai);
    } 

    public double setPangkat(){
        return (this.pangkat);
    } 

    public void hitungBilanganPangkat(){
        int hasil=(int) Math.pow(setNilai(), setPangkat());
        System.out.println("Hasil Bilangan "+ setNilai() + " berpangkat "+ setPangkat() + " adalah "+ hasil);
    }

    public static void main(String args[]) {
        BilanganPangkat obj = new BilanganPangkat();
        obj.setBilanganPangkat(5, 2);
        obj.hitungBilanganPangkat();
    }
}
