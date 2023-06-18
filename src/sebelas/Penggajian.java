package sebelas;

public class Penggajian {
  double gapok;
  double masa_kerja;

  Penggajian(double g, double mk) {
    gapok = g;
    masa_kerja = mk;
  }

  Penggajian() {
    gapok = 0;
    masa_kerja = 0;
  }

  Penggajian(double lembur) {
    gapok = masa_kerja = lembur;
  }

  double hitung_gaji() {
    return gapok * masa_kerja;
  }
}
