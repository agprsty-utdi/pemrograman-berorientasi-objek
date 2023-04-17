package enam;

public class SepedaMotor {
    private String tipe_mesin;
    private String kapasitas_mesin;
    private String bahan_bakar;
    private int kapasitas_bahan_bakar;
    private String tipe_rangka;

    public String getTipeMesin() {
        return tipe_mesin;
    }

    public String getKapasitasMesin() {
        return kapasitas_mesin;
    }

    public String getBahanBakar() {
        return bahan_bakar;
    }

    public int getKapasitasBahanBakar() {
        return kapasitas_bahan_bakar;
    }

    public String getTipeRangka() {
        return tipe_rangka;
    }

    public void setTipeMesin(String tipe_mesin) {

        this.tipe_mesin = tipe_mesin;
    }

    public void setKapasitasMesin(String kapasitas_mesin) {
        this.kapasitas_mesin = kapasitas_mesin;
    }

    public void setBahanBakar(String bahan_bakar) {
        this.bahan_bakar = bahan_bakar;
    }

    public void setKapasitasBahanBakar(int kapasitas_bahan_bakar) {
        this.kapasitas_bahan_bakar = kapasitas_bahan_bakar;
    }

    public void setTipeRangka(String tipe_rangka) {
        this.tipe_rangka = tipe_rangka;
    }

    public void cetakSepedaMotor() {
        System.out.println("");
        System.out.println("Tipe Mesin : " + this.tipe_mesin);
        System.out.println("Kapasitas Mesin : " + this.kapasitas_mesin);
        System.out.println("Bahan Bakar : " + this.bahan_bakar);
        System.out.println("Kapasitas Bahan Bakar : " + this.kapasitas_bahan_bakar);
        System.out.println("Tipe Rangka : " + this.tipe_rangka);
    }
}
