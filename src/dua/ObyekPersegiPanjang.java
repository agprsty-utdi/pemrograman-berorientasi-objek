package dua;

public class ObyekPersegiPanjang {
    public static void main(String[] args){
        PersegiPanjang[] persegipanjang = new PersegiPanjang[3];
        
        for(int i=0;i<3;i++){
            persegipanjang[i] = new PersegiPanjang();
        }

        persegipanjang[0].setPersegiPanjang(5, 5);
        persegipanjang[1].setPersegiPanjang(10, 10);
        persegipanjang[2].setPersegiPanjang(15, 15);
        
        for(int i=0;i<3;i++) {
            System.out.println("Persegi Panjang ke: "+i);
            persegipanjang[i].tampil();
        }
    }
}