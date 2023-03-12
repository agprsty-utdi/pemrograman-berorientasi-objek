package satu;

public class ObyekHandphone {
    public static void main(String[] args){
        Handphone handphone1 = new Handphone();
        handphone1.setHandphone("Xiaomi","Mi Mix 2",1500000);
        handphone1.tampil();

        Handphone handphone2 = new Handphone();
        handphone2.setHandphone("Xiaomi","Redmi Note 10 Pro",2500000);
        handphone2.tampil();
    }
}