public class soal5b {
    public static void main(String[] args) {
    boolean anggota = true;
    boolean bayar = true;

    if (anggota) {
      if (bayar) {
        System.out.println("Akses e-book dibuka");
      } else {
        System.out.println("Harap bayar iuran dulu");
      }
    } else {
      System.out.println("Silakan daftar anggota dahulu");
    }
}
}
