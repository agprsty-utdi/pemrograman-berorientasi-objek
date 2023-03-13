package dua;

public class PersegiPanjang {
    int panjang;
    int lebar;

    public void setPersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getLuas() {
        return panjang * lebar;
    }

    public int getKeliling() {
        return (2*panjang) + (2*lebar);
    }

    public void tampil() {
        System.out.println("keterangan: panjang = " + this.panjang + ", lebar = " + this.lebar);
        System.out.println("luas: " + getLuas());
        System.out.println("keliling: " + getKeliling() +"\n");
    }
}
