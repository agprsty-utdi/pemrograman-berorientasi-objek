package enam;

public class ImplementSepedaMotor {
    public static void main(String[] args) {
        SepedaMotor dataPeg = new SepedaMotor();
        dataPeg.setTipeRangka("Silinder Tunggal");
        dataPeg.setTipeMesin("124,89 cc");
        dataPeg.setKapasitasMesin("PGM-FI");
        dataPeg.setKapasitasBahanBakar(4);
        dataPeg.setBahanBakar("Bensin");
        dataPeg.cetakSepedaMotor();
    }
}
