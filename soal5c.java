public class soal5c {
    public static void main(String[] args) {
    boolean anggota = true;
    boolean bayar = false;

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
