package lima;
import lima.buku.*;

public class CetakBuku {
    public static void main(String[] args) {
        Buku buku = new Buku("Do You Do", 75000, 210);
        buku.show();
    }
}