package tiga;

public class Segitiga {
    double alas, tinggi;

    public void setSegitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    } 

    public double setAlas() {
        return (this.alas);
    } 

    public double setTinggi(){
        return (this.tinggi);
    } 

    public void luas() {
        // RUMUS LUAS SEGITIGA:
        // 1/2 x alas x tinggi

        double luas;
        luas = 0.5 * (setAlas() * setTinggi());
        System.out.println("Luas segitiga dengan alas "
            + setAlas() + " dan tinggi " + setTinggi() 
            + " memiliki luas " + luas + " cm");
    }

    public static void main(String args[]) {
        Segitiga obj = new Segitiga();
        obj.setSegitiga(8, 7);
        obj.luas();
    }
}
