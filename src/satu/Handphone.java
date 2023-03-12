package satu;

public class Handphone {
    String merek;
    String tipe;
    int harga;

    public void setHandphone(String merek, String tipe, int harga){
        this.merek=merek;
        this.tipe=tipe;
        this.harga=harga;
    }

    public void tampil(){
        System.out.println("Merek handphone : "+merek);
        System.out.println("Tipe handphone : "+tipe);
        System.out.println("Harga handphone : "+harga+"\n");
    }
}
