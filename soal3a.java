public class soal3a {
      public static void main(String[] args) {
    int jamKendaraanMasuk = 10;
   
   if (jamKendaraanMasuk < 12) {
      System.out.println("Pagi, tarif Rp 5000");
    } else if (jamKendaraanMasuk >= 12 && jamKendaraanMasuk < 18) {
      System.out.println("Siang, tarif Rp 7000");
    } else {
      System.out.println("Malam, tarif Rp 10000");
    }
      }
}
